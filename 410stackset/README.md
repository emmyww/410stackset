Overview

You are going to build in Java an implementaion for what we will call a StackSet (SST) using linked cells to do it. By StackSet, you will see (hopefully) as we define its behavior that it is sort of a Stack, but with a uniqueness criterion on its elements, just as a Set contains unique elements. So the StackSet code will implement a Set (where order is not important, just membership and size) and it will also behave much as a Stack (LIFO order, sort of). We say "much as" a Stack because there is a small difference... or two.

As we saw in class, a Stack is commonly implemented as an array, or as a sequence of linked cells. We are doing the later in this assignment, so that you get some practice in manipulating linked data structures in Java.

Using linked cells means do not use arrays to contain the elements stored in the List. It also means do not use any of the code from the Java Collections library to get your work done. In this assignment we want you to learn how make this data structure work more than how to use it to solve a problem.

The class Node below shows how we do linked cells in Java. A linked cell is an object (class instance) that has one (or more) references to other objects of the same class. So a list cell refers to another list cell (the next one in the linked sequence ).

Our implementation will be a singly linked list. This means there is just one link in each cell, and in our Node that link points to the cell that follows the one contining the link (points to the "next" cell in the chain). As you see in the Node class, there is a next field to hold this reference.

A link in Java is just a reference to an object ( a memory address where the object storage is found). When we do something like this in Java code

  Node myObj = New Node();
  myObj = myObj.next;
we think of storing the object itself into the variable or field, but what we really store is the reference... the object address in memory. To get to the fields of the object, we have to "dereference" the reference... meaning we have to go to the address and get the data stored at that address. The Java complier handles "dereferencing" automatically so we think of manipulating objects rather than memory locations.
In older languages (like C) references are called pointers and they are basic types; a variable containing a pointer can be manipulated with various operations like "+" and different memory locations can be accessed via an explicit dereferenceing operator. Java was created to (among other things) try to use objects in a less error prone way than by explicitly manipulating memory references. Ok... history lesson over.. now on to this assignment.

We ask that you use the boilerplate code provided and work from it. You should copy and paste the boilerplate below int Eclipse and then fill in the blanks by implementing the methods of the interfaces.