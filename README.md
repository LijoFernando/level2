# level2
Level2programing Task Questions
Level 2
Candidates can use any of these languages [ C, C++, Java]
Don't use any inbuilt functions
Duration : 3 hours

1. Arrange the elements of the array in descending order of the number of factors of each element.
Input : {7, 6, 8}
Output : {8, 6, 7} or {6, 8, 7}
Explanation : Factors of 8(1, 2, 4, 8); 6(1, 2, 3, 6); 7(1, 7)
Input : {1, 6, 7, 4, 9}
Output : {6, 9, 4, 7, 1} or {6, 4, 9, 7, 1}
Explanation : Factors of 6(1, 2, 3, 6); 9(1, 3, 9); 4(1, 2, 4); 7(1, 7); 1(1)

2. Given two strings of the same length. Compare the strings and print all pairs of
substrings that do not match with each other.
Input:
abcddefgikom
abecdeffgklm
Output:
cd,ec
gi,fg
o,l

3. Check whether a given integer number N is a binary Palindrome
● String manipulation is not allowed.
● Don't use any array
Input: 5
Output : Yes
Explanation : Binary representation of 5 is 101, which is a palindrome.
Input: 10
Output : No
Explanation: Binary representation of 10 is 1010, which is not a palindrome.

4. Given a 2D matrix, starting from top left and ending at bottom right, print the path which will give
the maximum sum
Note: You can travel only in right and down directions
Input
10 20
2
40
Output
Path is 10->20->40 and the sum is 70
Input
56 45 12 24
75 95 35 5
12 75 35 50
Output
Path is 56->75->95->75->35->50 and the sum is 386
Input
65 75 100 12
14 95 5 15
105 15 35 30
5
12 100 50
Output
Path is 65->75->95->15->35->100->50 and the sum is 435

5. Assume a two dimensional string array. Each array contains child and father details. '0' th element
is the child's and '1' st is the father's name. Write a program to accept a name and find the number
of grand children he has.
Example Data:
[
['Lava' , 'Rama'],
['Kusha' , 'Rama'] ,
['Rama' , 'Dasarathan'],
['Lakshman' , 'Dasarathan'] ,
['Angad', 'Lakshman'],
['Dharamketu','Lakshman'],
['Abhisek','Amitabh'],
['Aaradhya','Abhisek']
]
Input: Dasarathan
Output: 4
Input: Amitabh
Output: 1
