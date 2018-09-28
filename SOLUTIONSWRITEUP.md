# How to Run

* Run main
* Type numbers. First is B, second is N, all the rest are numbers in the input array
* Press enter

# Test Data + Results

_Note: input includes B and N as first two numbers._

Running on sample data from lab instructions:
Input: 20 8 12 4 8 15 9 3 1 10
Empty space in bins: 1
Sum of leftover unpacked elements: 3

Running on numbers all larger than B:
Input: 20 8 45 21 24 56 87 410 54 32
Empty space in bins: 60
Sum of leftover unpacked elements: 729

Running on pseudo-pseudo-random data (me pressing numpad)
Input: 50 10 49 35 12 23 8 4 6 37 78 1
Empty space in bins: 2
Sum of leftover unpacked elements: 105

Running on repeating number that is factor of B
Input: 20 12 5 5 5 5 5 5 5 5 5 5 5 5
Empty space in bins: 0
Sum of leftover unpacked elements: 0

Running on paired numbers a, b where a+b=B
Input: 20 6 19 1 18 2 17 3
Empty space in bins: 0
Sum of leftover unpacked elements: 0


# Explanation of Algorithm

Reverse sort array of input (not including B, N)
For every element in now reverse sorted array (starting at largest, going to smallest), attempt to add to each unfilled bin
If add is successful, do not try to add to another bin and move on to next number in array
If add is not successful, try to add to next unfilled bin
If every attempt to add fails, add element to sum of non-packed numbers and don’t ever try to add again
When a bin becomes perfectly full (eg, 20/20), it is no longer considered for adding an element


# When Algorithm Does/Doesn’t Find Optimal Solution

## Does find optimal solution when:
All elements passed are a factor f of B and the number of elements are equal to f*(B*3)
Elements passed are paired together to add up to B (ie, if B=20: 19 1 18 2 17 3)

## Does not find optimal solution when:
There are elements greater than B, such as when 
B=20, N=3, and the elements are 21,21,21. Bins are empty.
There are elements less than B, but are not been able to be packed because of elements of higher values being sorted and put into bins first. Such as, when B=21, N=10, and the elements are 19, 19, 19, 3, 3, 3, 3, 3, 3, 3. Our algorithm has an unused space of 21, where if the first three 19s were not packed in the bin 1,2,3 it could have been 19. 


# Efficiency of Algorithm in Terms of Big-O

Takes array and reverse sorts: Big-O(n*lgn)
Note: this answer is from SO saying that Collections.sort is Big-O(n*lgn)
Goes through reverse sorted list element-by-element and tries to add to each unfilled bin: Big-O(n)
So algorithm overall is Big-O(n*lgn + n) = Big-O(n*lgn)
