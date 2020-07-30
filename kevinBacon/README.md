# Project 7: Graphs
## Assignment Type: Closed [(see policy)](http://www.cs.umd.edu/class/summer2019/cmsc132/openClosedPolicy.shtml)

# Overview
For this project you will be constructing graphs based on a file format and then preforming operations on the graph. Each node in the graph is given a name and may be connected to an arbitrary number of other nodes. You must implement a variety of methods that return answers to questions about the graph, such as finding the neighbors to a string.

You are given the following classes to help you:
* Bag - used for containing a list of objects
* Graph - represents a graph, each node is given a integer id
* BreadthFirstPaths -  when given a graph, this class can be used to find distances, check if a path exists, and iterate through the nodes in the shortest path

# Objectives
This project serves as practice for performing basic graph procedures 

# SymbolGraph
## Constructor/File Format
Each graph file contains a list of vertex descriptions. Each vertex description is separated by a new line. Each vertex description is a list. The entries in the vertex description are separated by delimiters, such as "/". The first entry in the list is the vertex name, and all subsequent entries are the names of the adjacent vertices. In the constructor for SymbolGraph, you will load **all** the data in the file and then construct a graph. Note that the Graph class only uses integers to describe vertices, you will need to make use of the TreeMap to translate between the String name and the Integer name.

## contains
This method will return true if the graph contains the string

## neighbors
Returns a Bag of all vertices adjacent to the source

## list
Returns a Bag of all the strings in the graph which contains the substring s

## index
Returns the Integer name of the vertex that corresponds with the string s

## name
Returns the String name of the vertex that corresponds with the Integer v

# KevinBaconNumber

## path
Returns the length of the path from source to sink. If the path does not exist then return null


# Grading
* Public Tests (44%)
* Release Tests (28%)
* Secret Tests (28%)

# Code Distribution
You are provided with the following packages:
* sixdegrees - this is the main package for the project
* tests - Includes the public and Student tests. 

# Requirements/Project Policies
* You may not add any classes, but feel free to add any instance variables and private methods you understand are necessary.
* See [Style Guidelines](http://www.cs.umd.edu/class/summer2017/cmsc132/resources/StyleGuidelines.html) for information regarding style.
* We cannot provide any information regarding release and secret tests. 

# Testing
* It is recommended that you write your own student tests by creating basic graphs in the file format described above. Remember to test edge cases, such as graphs with loops.

# Submission
To submit your project, zip the project folder and upload the zipped file to gradescope.

# Academic Integrity
Please make sure you read the academic integrity section of the syllabus so you understand what is permissible in our programming projects. We want to remind you that we check your project against other students' projects and any case of academic dishonesty will be referred to the Office of Student Conduct. 

