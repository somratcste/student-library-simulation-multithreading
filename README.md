# Student Library Simulation Using Java Multithreading
Solution for Student Library Simulation Problem Using Java Multithreading

## Problem 
* There are 5 students and 7 books 
* The students can read the book 
* A book can be read by one student at a given time
* The problem: How to create a concurrent algorithm such that two students 
  can avoid manipulating the same book at the given time?
  
## Aim 
* The aim of the project is one student can read one book at a given time 
* All the thread are going to be executed by the executor service
* We are going to use lock()

## Process
```
while(true) { 
    read();
    // start reading 
    // finish reading 
    // No more reading. Make free for other student!
}
```

## Output
```
Student: 1 starts reading Book: 2
Student: 0 starts reading Book: 5
Student: 3 starts reading Book: 3
Student: 4 starts reading Book: 5
Student: 2 starts reading Book: 2
Student: 3 has finished reading Book: 3
Student: 0 has finished reading Book: 5
Student: 1 has finished reading Book: 2
Student: 0 starts reading Book: 3
Student: 4 has finished reading Book: 5
Student: 2 has finished reading Book: 2
Student: 3 starts reading Book: 5
Student: 2 starts reading Book: 4
Student: 4 starts reading Book: 0
Student: 0 has finished reading Book: 3
Student: 3 has finished reading Book: 5
Student: 4 has finished reading Book: 0
Student: 2 has finished reading Book: 4
Student: 0 starts reading Book: 0
Student: 1 starts reading Book: 5
Student: 3 starts reading Book: 1
Student: 3 has finished reading Book: 1
Student: 4 starts reading Book: 5
Student: 0 has finished reading Book: 0
Student: 1 has finished reading Book: 5
Student: 2 starts reading Book: 0
Student: 1 starts reading Book: 4
Student: 0 starts reading Book: 6
Student: 3 starts reading Book: 3
Student: 4 has finished reading Book: 5
Student: 0 has finished reading Book: 6
Student: 4 starts reading Book: 4
Student: 1 has finished reading Book: 4
Student: 3 has finished reading Book: 3
Student: 2 has finished reading Book: 0
Student: 3 starts reading Book: 1
Student: 0 starts reading Book: 6
Student: 2 starts reading Book: 2
Student: 4 has finished reading Book: 4
Student: 1 starts reading Book: 4
Student: 4 starts reading Book: 2
Student: 2 has finished reading Book: 2
Student: 0 has finished reading Book: 6
Student: 3 has finished reading Book: 1
Student: 2 starts reading Book: 5
Student: 3 starts reading Book: 0
Student: 1 has finished reading Book: 4
Student: 4 has finished reading Book: 2
Student: 3 has finished reading Book: 0
```
