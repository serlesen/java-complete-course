# Complete course of Java for beginners

This repository is for beginners to train with some practical
exercises to learn programming in Java.

To use it, you must almost have installed:
* Java 11 (https://www.oracle.com/java/technologies/javase-downloads.html)
* Maven (https://maven.apache.org/download.cgi)
* Git (https://git-scm.com/downloads)
* Eclipse (https://www.eclipse.org/downloads/)

This project will contain, per tag, the described topics used in the
Youtube videos with examples to let the reader read them. There are
also some unit tests which won't run, to let the user correct them
with the learned from the current lesson.

To run the tests, run the following command from a terminal:
`mvn test`


## Chapter 1

In the first chapter, I explain the basic syntax used in Java. How things
are written and how the code is organized. I also explain how to start an
application and print data in the screen.

To see the content, run from a terminal:
```
git checkout chapter_1
```

You will have exercices/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_1_solutions
```

------------------------------- link ----------------------------

### Comments
The comments are used to describe the application with a human readable text.
What you write in a comment won't be run, won't be interpreted by Java.

A single line comment start with //.
A multiple line comment start with /* and finished with */.
The multiple line comment can also be used in a single line to comment only
a part of a line.


### Declare variables
Variables are used in Java to store values. Variables can have their values
changed during the application run. To declare a variable, you must start
by its type, then its name and optionally an initial value. At the end of
each statement, you must always have a ;.
```
int i = 0;
```

### Packages
The packages are the folders where to store parts of the application. Name
the packages depending on what you store on each folder. You can have as many
sub-packages as you want. Even empty packages.

### The main method
The main method is the entry point of an application. It's where an application
will start. If you want the application to be able to run with an executable
file, it must contain the main method declared wherever you want as following:
```
public static void main(String[] args) {
}
```

### System.out.print
Much of the time, you will need the application to talk to you, to show you some
information. The following command let you print whatever you want from the application:
variable values, strings, results...
```
System.out.print()
```
or 
```
System.out.println()
```


## Chapter 2

In the second chapter, I first variable types of Java, the primitive variables.
The primitive variables are the easiest variables to learn, the other are the
objects. The primitive variables are stored as the value itself, which can be
numbers, floating numbers, boolean or characters. In this chapter, I will show
them all and work with the most important operations.

To see the content, run from a terminal:
```
git checkout chapter_2
```

You will have exercices/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_2_solutions
```

------------------------------- link ----------------------------

### Primitives
Here I will list all the primitives and describe their limits. How many characters
can be used with the char. What values accept a boolean. The length of the numbers.
And the difference with the floating numbers.

### Math operations
The numbers can be used for math operations as the sum, subtraction, multiplication
and division. For the division, if the input numbers are integers, the result will
be an integer; and if the input numbers are floating numbers, the result will be
a floating number. For the integers, there is also the remaining, or modulo, operation.

### Boolean operations
The boolean operations are used very often to guide the execution of an application
with the workflow operations (if statement and loops). The boolean operations are the
number comparisons, greater than, greater or equal, less than, less or equal, equal
and different. But there are also logical operations between other boolean values, AND,
OR and NOT.

### Binary representation
The number are just a list of bits which are reserved in the computer memory. A bit
can only have two values: 0 or 1. With those 0s and 1s, you can obtain the decimal
numbers we're used to work with. To do so, sum the powers of 2 (from the rigth to the
left). The first bit represents the value of 2 powered to 0 which is 1; if the first
bit is 1, add 1 to the decimal number. The second bit represents the value of 2 powered to
1 which is 2; if the second bit is 1, add 2 to the decimal number. The third bit
representes the value of 2 powered to 2 which is 4; if the third bit is 1, add 4 to
the decimal number. And you can continue like that until 64 bits (which is the biggest
number you can have in Java). Which means that to obtain the decimal number of 10,
you must use 8 + 2 or 2^3 + 2^1 which is 1010.

### Bitwise operations
As the numbers are just a decimal representation of a binary number, you can perform
bitwise operations in numbers, bitwise operations on each bit of a number, like: AND,
OR, XOR and shift to the left or to the right.


