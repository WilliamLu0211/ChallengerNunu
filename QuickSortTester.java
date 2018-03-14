/*  Team ChallengerNunu - William Lu, Andrew Shao, Max Millar
    APCS2 pd2
    L01: What Does the Data Say?
    2018-03-15 R */

public class QuickSortTester{

    public static void main(String[] args){

        String output = "Size(n),Runtime(ns)\n";
        long start, end, sum;
        int[] arr;
        for (int i = 100; i <= 10000; i += 100){
            
            sum = 0;
            for (int j = 0; j < 100; j ++){
                
                arr = QuickSort.buildArray(i, 99999);
		/*arr = new int[i];
		for (int k = 0; k < i; k ++)
		arr[k] = k;*/
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
