Team ChallengerNunu - William Lu, Max Millar, Andrew Shao

APCS2 pd2

L01: What Does the Data Say?

2018-03-15 R

### Hypothesis
QuickSort's Big-Oh runtime classifications are:
-	O(n) = nlogn in the best case
-	O(n) = nlogn in the average case
-	O(n) = n^2 in the worst case

### Background
QuickSort is an array sorting algorithm developed by British computer scientist Tony Hoare in 1959.
QuickSort works by recursively dividing the array into smaller sub arrays to be individually sorted.

##### How it works:
1.	Take the first element as a "pivot" element.
2.	Partition the array such that all other values less than the pivot element 
	are to the left of the pivot element and all values greater than the pivot element 
	are to the right of the pivot element.
3.	Repeat this algorithm for both the left (smaller) and right (bigger) sections
	until the sections are of length 1 and as a result, are sorted.

### Experiment Methodology
To accurately evaluate the runtime categorization of QuickSort,
we measured the execution times for running our Java implementation of QuickSort
 on arrays of varying sizes and with varying values.
We tested the best, average, and worse cases for QuickSort.
-	Best case: values in array are randomly generated.
-	Average case: values in array are already sorted ascendingly.
-	Worst case: values in array are already sorted descendingly. 
We tested arrays of size 100 to 10000, incrementing by 100 each time.
For each size we took the average time from running 100 trials.

### Results
![Runtime vs Size graph](/graph.jpg?raw=true "Graph of Runtime vs Array Size")

### Conclusions
When we graphed the data, the graphs for the best and average cases 
both resembled horizontally dilated nlogn graphs.
Our graph for the worst case resembled a horizontally dilated n^2 graphs.
From this we concluded that our hypothesis was correct.
