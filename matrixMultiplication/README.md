# Introduction

Matrices (singluar: Matrix) are rectangular arrays of Numbers (sometimes symbols) arranged in Rows or Columns. For example
[1 2 34
32 5 94]
is a two by three (2x3) array. 
Matrices have a lot of uses. They can represent vectors in n dimensions, define transformations between dimensional spaces, efficiently solve systems of linear equations, describe position as well as orientation in far more compact ways, describe rotations, show sets of probabilities, represent the derivative operation, and much more.
Matrix multiplication is a useful concept in computer science; for example, GPUs are essentially powerful parallel matrix multipliers. If you do not know how to multiply matrices https://mathworld.wolfram.com/matrixMultiplication.html may be a useful link for you.
Multiplication of matrices are however simply a series of arithmetic operations which computers are fairly fast at. However, the sheer number of operations means that as matrices get larger and larger, they start to suffer from performance issues. We will multithread the operation to see what kind of speedups are possible for this type of problem.


# Objectives
The goal of this project is to learn basic multithreading through implementing matrix multiplication and demonstrate the potential speedup gains that multithreading offers.

# Grading
(100%)  Tests
(15%)   Public Tests
(85%)   Release

# Code Distribution
The code distribution provides the following
Matrix package - matrix helper functions should be defined here as well as multiply
Tests package - contains public tests

# Specifications
Implement all of the public methods which have headers given.
You are responsible for implementing a multithreaded implementation of multiply. 
Return null instead of 0 sized arrays

# Requirements
Verify your project passes tests 
Follow the style guidelines for this course
If you have issues with your code and go to office hours for assistance, ensure that you have student tests illustrating your issue

#Submission
Submit your project through gradescope by zipping up the project folder and submitting the zip file

#Academic Integrity
Please follow the academic integrity section of the syllabus. We check projects against other students and any case of academic dishonesty will be referred to the Office of Student Conduct
