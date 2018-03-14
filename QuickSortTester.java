/*  Team ChallengerNunu - William Lu, Andrew Shao, Max Millar
    APCS2 pd2
    L01: What Does the Data Say?
    2018-03-14 W */

public class QuickSortTester{

    public static void main(String[] args){

        String output = "Size(n),Runtime(ns)\n";
        long start, end, sum;
        int[] arr;
        for (int i = 100; i <= 10000; i += 100){
            
            sum = 0;
            for (int j = 0; j < 100; j ++){
                
                arr = QuickSortTester.buildArray(i, 99999);
                start = System.nanoTime();
                QuickSort.qsort(arr);
                end = System.nanoTime();
                sum += end - start;
                
            }
            output += i + "," + sum / 100 + "\n";   

        }
        System.out.println(output);

    }

}
