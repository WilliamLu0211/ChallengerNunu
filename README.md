# ChallengerNunu
Team Name: Runmin (William) Lu, Max Millar, Andrew Shao
Title

### Hypothesis
QuickSort's Big-Oh runtime classification is O(n) = nlogn.

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
 on arrays of varying sizes and with randomly generated values.
We tested arrays of size 100 to 10000, incrementing by 100 each time.
For each size we took the average time from running 100 trials.

### Results
##### Graph of Runtime vs Array Size
![Runtime vs Size graph](/graph.jpg?raw=true "Runtime vs Array Size")

### Conclusions
When we graphed the data, the graph considerably resembled a horizontally dilated graph of nlogn.
From this we concluded that our hypothesis that QuickSort's big-Oh notation was nlogn was very likely
to be true. 
While our graph does also somewhat resemble that of a linear function, we think that this may just be 
due to the inherent discrepencies and inaccuracies that come with testing with randomness involved and 
measuring very small values.
