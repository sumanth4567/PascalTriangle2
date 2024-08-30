# PascalTriangle2

LeetCode Question Number - 119 Easy

Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
Example Diagram:

                        1
                    1       1
                1       2       1
            1       3       3       1
        1       4       6       4       1
    1       5       10      10      5       1
 

Example 1:
Input: rowIndex = 3
Output: [1,3,3,1]

Example 2:
Input: rowIndex = 0
Output: [1]

Example 3:
Input: rowIndex = 1
Output: [1,1]
 
Constraints:
0 <= rowIndex <= 33


Solution:

This approach is known as computing binomial coefficients directly. Each element in the row of Pascal’s Triangle corresponds to a binomial coefficient, which can be calculated using the formula:

c(n,k)=n!/(k!*(n-k)!)

Initialization: Start with the first element, which is always 1.
Iterative Calculation: For each subsequent element, use the relationship: c(n,k) = c(n,k-1)*((n-k+1)/k)
