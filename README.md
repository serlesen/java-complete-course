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

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_1_solutions
```

https://www.youtube.com/watch?v=oz0KUbUl1U4&list=PLab_if3UBk9-ktSKtoVQoLngTFpj9PIed&index=4&t=0s

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

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_2_solutions
```

https://www.youtube.com/watch?v=DVWjxuV0GPk&list=PLab_if3UBk9-ktSKtoVQoLngTFpj9PIed&index=6&t=0s

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


## Chapter 3

In the third chapter, we enter into the world of the object oriented programming. Here
will be presented the objects: how to create an object/class, how to use it, how to
add fields and methods.

I will try to explain the concept of an object with the similarity with a car. The
definition of a car is the same for all the brands, but each car has a different behavior.
It's the same with the objects: you have a single definition, but once instanciated,
the behavior may differ a lot.

To see the content, run from a terminal:
```
git checkout chapter_3
```

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_3_solutions
```

---------------------------------------- link ------------------------------------------

### Class

An object is created with a Java Class. What will be inside this class will be the definition
of the behavior of the current object, of the current class. To instantiate a class we
need a constructor. Each class have a default empty constructor. But another one can be
created, with input parameters and some initial statements. The constructor is the method
which will be called when creating the object, when creating an instance. This method
will set up the initial state of the object (setting some inner fields).

### Methods

The methods are the communication of the object with the rest of the application. The public
methods can be called from the outside of the class, and the private methods can only be
used inside the current class. The methods owned by the object are not static (that's the
difference with the `public static void main` method). This means that to call the method
you must first instantiate the object and call the method from the instance variable (and
not from the class name).

### Fields

The fields are variables which are set at the class scope. They are declared inside the class
and not inside a method. Those fields will determine the behavior of the class. Those fields 
may have a different value for each instantiation of the same class.


## Chapter 7

In this seventh chapter, we will see the loops. The loops are very important to manage the
execution flow of an application. You can iterate until a condition is satisfied (or no
more satisfied), you can iterate over a range of number (from 1 to 10), or you can
iterate over a list of elements.

In this chapter, we will take a look at the while-loops, do-while-loops, for-loops and 
for-each-loops.

To see the content, run from a terminal:
```
git checkout chapter_4
```

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_4_solutions
```

-------------------------------------- link ------------------------------------

### While loops

The while loops are the oldest one. The will iterate over a set of instructions
while a condition is true.

```
while(condition) {
	// set of statements
}
```

### Do-While loops

The do-while loops is an evolution of the while loops, where you can first iterate
over the instructions and then check the exit condition. When changes is the order
of the first iteration: with the while-loop we first check the condition and then run
the statements, with the do-while-loop we first run the statements and then check
the condition.

```
do {
	// set of statements
} while(condition);
```

### For loops

The for-loops are easiest to use, because the exit condition and the iterative condition
are defined together in the loop definition. There is less probability to fall into
an infinite loop in comparison with the while-loops.

To define a for-loop, we have three statements:
* the initialization
* the exit condition
* the iterative statement: which is use to modify the exit condition until the exit of the loop

```
for (initialization; exit_condition; iterative_statement) {
	// set of statements
}
``` 

### For-each loops

The for-each loops are a variant of the for loops used with lists or sets. With the for-each
loop, we don't need to care about the initialization, exit condition and iterative statement.
The for-each loop will automatically iterate over each element of the give list.

```
for (var item : list_of_items) {
	// set of statements
}
```

### Special keywords

To control the loops, we have some special keywords:
* break: which will break the loop, exit the loop, and continue the execution below the loop
* continue: which will jump to the next iteration
* return: as break, it will break the loop, but also the current method


