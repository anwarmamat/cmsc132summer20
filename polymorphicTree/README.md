# Polymorphic Trees

## Due Date: July 23rd 2020


# Overview

You will be completeing recursive tree functions which are based on a polymorhpic 
tree class. You will be doing error handling, recursion, polymorphism. 

## Layout of Project

```
doc
  the files to tell you what to do. index.html is where to start
src
  tests
    StudentTests.java
    Tests.java
  tree
    EmptyTree.java
    NonEmptyTree.java
    PlaceKeysValuesInArrayLists.java
    PolymorphicBST.java
    TraversalTask.java
    Tree.java
    TreeIsEmptyException.java
```

You only need to modify EmptyTree, NonEmptyTree, PolymorphicBST, and 
PlaceKeysValuesInArrayLists.java.

## Things to know
The Classes PolymorphicBST and interface Tree describe the behavior of individual methods that need to be implemented. Certain methods have been left implemented as an example for you to see code that conforms to the restrictions.


# Design

- Notice that the insert and delete methods on `Tree` objects return references to Tree objects. In many cases, these functions may return a reference to the this object. However, in some cases they can't. For example. `EmptyTree.getInstance.insert("a", "1")` has to return an instance of an NonEmptyTree object.

# Design and Implementation Restrictions

 -    You may not use any form of looping construct.
 -    You may not use any arrays.
 -   You may not explicitly check a `Tree` to see whether it is an `EmptyTree` or `NonEmptyTree`.
 -    Your `EmptyTree` and `NonEmptyTree` implementations may not have any comparisons against the null value.
 -   You should not need to do any casting for this project. If you are casting, you are probably not using generic programming correctly.
  -   If you insert multiple values with the same key, only the value associated with the most recent insertion will be saved.
  -   You may not use any classes from `java.util` except `ArrayList`, `Set` and `HashSet`.
  -   You may not add any public methods.
  -   You may not check whether a tree is empty by using comparisons similar to the following:
        - `left == EmptyTree.getInstance()`
        - `tree.size() == 0`
        - Other comparisons similar to the above

- You are expected to use polymorphism (and exception handling, where appropriate) to handle the differences between empty and nonempty trees. Failure to do so will result in a large negative adjustment to your project grade.
- You may not use `Collections.sort` for this project.
- You may not use `instanceof`.
- You may not use `getClass()`.
- The delete method must use the approach described in the lecture slides. You may not implement delete by creating a new tree and inserting all the keys from the source tree except the one you want to delete.
- For the Subtree method you may not create an empty tree and traverse the whole tree inserting only those entries within the specified range. If a simple check will tell you that an entire subtree can be excluded, your implementation should not traverse that subtree.

The above restrictions do not apply to your test cases; you may write them however you wish. 

## Grading

Public Tests: 15%
Release Tests: 50%
Secret Tests: 35%
