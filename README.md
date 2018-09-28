# BinPackingProblem 

## Goal
The goal of this is to develop and implement an approximation algorithm to solve a Bin Packing Problem: find a way to pack N items of different fixed sizes into 3 bins with capacity B each. The algorithm should try to minimize
the amount of unused bin space (or, equivalently, the total unpacked amount).

Example: given B=20 and items of sizes 12, 4, 8, 15, 9, 3, 1, 10
You can pack the bins as [12, 8], [1, 4, 15], and [9, 10], with the leftover item of size 3.

It is proven that to find the optimal solution, one needs to consider all possibilities of packing which is exponential in N. However, there are good approximation algorithms that find a solution close to optimal in times polynomial in N. Your goal is to develop such an approximation algorithm, implement it, test it, and analyze its efficiency.

## Specific Requirements
• Your algorithm must be an approximation algorithm, it is not allowed to check all possibilities.
• Your algorithm does not have to find the optimal solution for all cases but it should find a good solution for most cases.
• The input includes the capacity of the bins followed by the numberof items N followed by the items themselves separated by spaces. For
instance, the input for the above problem is 20 8 12 4 8 15 9 3 1 10.

Here B=20, N=8, and the 8 items follow. See the Scanner class which allows you to read data from the Java console (standard input).

Your output should be the list of elements in each bin, the list of the unpacked items, and the amount of unused space. Please make your
answers readable.


