# SpecialElementsInMatrix

Problem:

Given a matrix of size m*n, m denotes the row starting with index 0 and n denotes the column starting with index 0.

For example, given a matrix of size 3*3, the elements are stored as follows.

1  3  4

5  2  9

8  7  6

The expected output is 7.

In the above example, we identified the output as 7 based on below.

1 - minimum in row and column
4 - Maximum in row
2 - Minimum in column and row
9 - Maximum in row and column
8 - Maximum in row and column
7 - Maximum in column
6 - Minimum in row


https://stackoverflow.com/questions/52628033/find-special-elements-in-a-mn-matrix/67425544#67425544
