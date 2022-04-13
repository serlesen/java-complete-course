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

https://www.youtube.com/playlist?list=PLab_if3UBk9-ktSKtoVQoLngTFpj9PIed

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


## Chapter 4

In this chapter, we will end with the objects, we will study the object references. And then,
introduce the strings.

 To see the content, run from a terminal:
```
git checkout chapter_4
```

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal
```
git checkout chapter_4_solutions
```

### Object references

The object references is the way an object is stored in the JVM. They
are not stored like the primitive types. The variables, in fact, store the memory address
to find the content of the object. To compare two objects, we have to use the `equals()` 
method and not the `==`.

### Strings

The strings are way more used than the single characters. Nevertheless, they are more complex
as they are objects. They are objects, but have a lot of primitive types behavior, like: the
`+` symbol to concat strings, the instantiation without the parenthesis and the `new` keyword.


## Chapter 5

This is the fifth chapter of the Java course, but the first one where we talk about the flow
control. From here, you will be able to manage how an application will run. In this chapter
we will see the if-conditions and the switch-cases.

To see the content, run from a terminal:
```
git checkout chapter_5
```

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_5_solutions
```

### If-conditions

The if-conditions allows you to split the run of an applications in two or more paths depending
on a logical condition. You can have an if-condition, an if-else-condition or an if-else-if-condition.

Here is how an if-else-if condition is implemented:
```
if (first-logical-condition) {
   // first block if the first logical condition is verified
} else if (second-logical-condition) {
   // second block if the second logical condition is verified
} else {
   // third block if none of the previous logical conditions are verified
}
```

### Switch-cases

If you have to chain multiple if-conditions, the best alternative is the switch-cases. The switch-case
is like an if-condition, where a single condition (integer or string) is evaluated and redirects to
a block of code.

```
switch (input) {
   case "first-value":
      // first block if the input is equal to "first-value"
      break;
   case "second-value":
      // second block if the input is equal to "second-value"
      break;
   defaut:
      // third block if the input doesn't match any of the cases
      break;
}
```


## Chapter 5.1

This small chapter is dedicated to the null reference. When instantiating an object, the memory
address is stored in the variable, not the entire value. But I may want to initialize a variable
without storing anything on it, storing an empty value, a null reference.

To see the content, run from a terminal:
```
git checkout chapter_5_1
```

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal
```
git checkout chapter_5_1_solutions
```

### The alternative

When programming, sometimes, I can't return the desired value. Like in a search algorithm, if
the desired element isn't found, I can't return it. Instead, I can return a null reference. But
this isn't the correct solution. As the null reference has no behavior behind, and if I expect
an object in the variable location but I have the null reference, I will get an exception if
I try to use it as an object.

In the other way, if I throw an exception instead of returning a null reference, the complete
application will be stopped until I catch the exception, and the null reference will be left
behind.


## Chapter 6

In this sixth chapter, we will work with the arrays, lists and maps. Those structures are very
important before entering with the loops. This is the way to store multiple element of the same
type to start a search, a map or a filter.

To see the content, run from a terminal:
```
git checkout chapter_6
```

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_6_solutions
```

### Arrays

The arrays are the most primitive type of lists. They have a fixed size, and the value cannot
be removed.

To instantiate a list:
```
int[] values = {1, 2, 3};
```

### Lists

The lists have more functionalities. The size isn't fixed, you can add as much element as you
want. You also can remove them. With the lists, you can start some basic search systems. You
should override the equals method of the object you're searching for to optimize the search
results.

To instantiate an array list:
```
ArrayList<Integer> values = new ArrayList();
```

### Maps

The maps are a key-value list. The values are stored next to the keys, to ease the way to fetch
the values. And the keys are first hashed to calculate the memory space where the value will be
stored. This way, to find a value from a key, we don't need to iterate over all the keys, the
same calculation will be made with the key to find where the associated value is stored.

To instanciate a map:
```
HashMap<Integer, String> values = new HashMap();
```


## Chapter 7

In this seventh chapter, we will see the loops. The loops are very important to manage the
execution flow of an application. You can iterate until a condition is satisfied (or no
more satisfied), you can iterate over a range of number (from 1 to 10), or you can
iterate over a list of elements.

In this chapter, we will take a look at the while-loops, do-while-loops, for-loops and 
for-each-loops.

To see the content, run from a terminal:
```
git checkout chapter_7
```

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_7_solutions
```

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


## Chapter 8

In this eighth chapter, I'm gonna work with the Enum. The Enums are some sort of constants,
functional constants. I usually use the enums to describe the status of an object. This way,
using an enum, I ensure that no strange value is used, only the allowed values fixed by the
enums. 

To see the content, run from a terminal:
```
git checkout chapter_8
```

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_8_solutions
```

### Fields in Enums

I can also add internal fields in an enum to enrich the enum. This way, an enum can have more
properties than just the name. To add a field, you must first create a constructor, a private
constructor, and when declaring each enum value, insert the value of the field inside the 
constructor.

```
private DaysOfWeek(int value) {
	this.value = value;
}
```


### Methods in Enums

As having fields to better describe an enum, we also can have methods. Common methods are used
to read the value of the fields. And static methods are used to search for an enum value.

```
public static DaysOfWeek find(int value) {
	// some logic
	return DaysOfWeek.MONDAY;
}
```


## Chapter 9

In this ninth video, I will explain the encapsulation, inheritance and polymorphism concepts. For that
I will use the Java interfaces and the abstract classes.

To see the content, run from a terminal:
```
git checkout chapter_9
```

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_9_solutions
```

### Interfaces

The interfaces are just method definitions of a class. When a class implements an interface, the class
must have methods declared the same way the interface. The class must have a behavior for the defined
methods. Nevertheless, some basic behavior can be written in the interface with the default methods.


### Abstract classes

The abstract classes act like the interfaces, but can have an already defined behavior for some methods.
It can even have fields that may be used in the children classes. To access the methods and fields from
the abstract class, from the parent class, the `super` keyword must be used.


### Inheritance

Both the abstract classes as the interfaces may have multiple levels. An abstract class may extends
another abstract class. And an interface can extend another interface. This is the inheritance, define
a complex behavior in multiple layers.


## Chapter 9.1

In the second part of the chapter dedicated to the abstract classes and interfaces, I will show how
to cast the objects from one class to another. But the casting is mainly based on the abstract classes
and interfaces, that's why it's the second part of the ninth chapter.

The casting is just saying that an object will act as a class which is not the one used for its definition.
It's a way to map a object into another class definition.

To see the content, run from a terminal:
```
git checkout chapter_9_1
```

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_9_1_solutions
```

### Casting primitive

The first type of casting is done with the primitive types and its boxed objects. The casting can be made
in both ways. From the primitive type to the boxed object:
```
int source = 15;
Integer destination = (Integer) source;
```

In this case, the cast class, the parenthesis, are not mandatory. Java can do the casting itself. And in
the reverse way:
```
Integer source = 15;
int destination = (int) source;
```
Even here, the cast is optional. Nevertheless, a problem may occur if the object has a null value. Because
Java can't map the null value into a primitive type. 

### Casting interfaces and implementations

Another way casting can be used is when casting an implementation of an object into the definition of its
interface. The most common case is the following:
```
List<Integer> list = new ArrayList<>();
```

The implementation is ArrayList and the interface is List. As with the primitives, the cast is optinal (it's
not included in the code).

And I can cast the list again into an ArrayList, but this way I will need to explicitly write the cast.
Casting an interface into an implementation may lead to ClassCastExceptions if the implementation used
is not the same as the one of the object.

### Casting abstract classes and parent classes

The last case is casting an object to its abstract class. It's the same as casting an implementation to its
interface. The same of the parent classes and its children.

### instanceof keyword

To avoid problems, the `instanceof` keyword will check if an object can be casted into a class or not. This
way, I can avoid most of the ClassCastExceptions. This operation returns a boolean result.


## Chapter 10

This tenth chapter will talk about the methods definitions. How to write a method, how to add input parameters,
how to set an output value, and how to set the visibility.

To see the content, run from a terminal:
```
git checkout chapter_10
```

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_10_solutions
```

### Input parameters

The input parameters can be from any type you want: objects or primitives. The particularity is that the 
primitives passed as input parameters by value, and the objects are passed as reference.

A best practice is to define the input parameters as final variables, because it makes no sense to modify 
their value. If it's an object, it means that you're setting another memory address in the pointer 
(loosing the original). And if it's a primitive, you're just overriding the original value.

Having objects as input parameters are the only way to modify the values from outside the method. Having 
primitives as input parameters, you must return the updated value which must be assigned back to the
original variable if you want to update it.


### Output parameters

The output parameter can be any type of class or primitive. And if it makes no sense to return something,
you can declare a method to return `void`. The `return` statement works as with a return type, but the right
side will be empty. In the case of a `void` method, the `return` statement will act as a break.

### Visibility

The methods visibility can be:
* `public` if you want to be accessible from outside a class;
* `private` if you want to be accessible only from inside a class;
* `protected` if you want to be accessible from the class itself or its parent (or grand parent). This work
for both abstract classes or interfaces.
* package private which means that the method can be invoke somewhere inside the same package.


### Static methods

The `static` keyword means that a class method can be invoked without the need to instantiate the class.


## Chapter 11

This chapter handles the recursive methods. The recursive methods are the one which call itself. This is
very useful when you want a repetitive action over a single object. But this must be taken with care.
The most important part of a recursive method is the terminal condition. This terminal condition must be
check at first inside the method, before call it again. Otherwise the method will be stuck into itself
forever.

To see the content, run from a terminal:
```
git checkout chapter_11
```

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_11_solutions
```


## Chapter 12

In this chapter I will explain the usage of the Exceptions. There are two kind of exceptions: runtime 
exceptions and checked exceptions.

To see the content, run from a terminal:
```
git checkout chapter_12
```

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_12_solutions
```

### Checked Exceptions

The checked exceptions are those where thrown by a method and that must be catched. When using a method
which has a checked exception declared, I must surround the usage of the method by a try/catch or declare
the method with the same excetpion. Otherwise, I get a compilation error.

### Runtime Exceptions

The runtime exceptions are those which don't need the try/catch block. Those exceptions can appear at any
time in the application. A try/catch can help, nevertheless, it's very difficult to guess where a runtime
exception can appear.

### Custom Exceptions

I can also create my own exception. The need to create a custom exception is to break my application at
any time due to a technical or functional problem. So, the best choice is to create a Runtime Exception
that can be throw at anywhere.

 
## Chapter 13

In this chapter I handle the keyboard input. The keyboard input is the main way a user has to communicate
with a Java application. To read data from the keyboard, I must first create a stream with tne input channel
of the system. With this stream, I read whatever variable type I need, integer or string.

To see the content, run from a terminal:
```
git checkout chapter_13
```

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_13_solutions
```


## Chapter 14

In this chapter I show multiple implementations to read and write files. I show some examples using the BufferedReader
and BufferedWriter implementations to read and write content in a file. Those implementations handle both bytes and 
string data. Using Streams and Buffered, I need to surround my code inside a try-with-resources, as all the objects
need to be closed after handleding the file.

Then, I show the usage of the Files implementation. This implementation only handle String, line by line. One
implementation returns a stream of lines, which also need to be closed at the end. And another implementation returns
all the lines by once.

To see the content, run from a terminal:
```
git checkout chapter_14
```

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_14_solutions
```


## Chapter 15

In this chapter I will show what are the generics and how to use or create them. The most used example is the lists.
A generic will indicate which class is accepted inside a list. This way, the list will only accept, without the need to
cast or check the class, the defined generic class. From Java 7, the generic definition is only needed in the left side
of the assignation.

Then, I will show how a custom class can be created to accept generics in its definition.

To see the content, run from a terminal:
```
git checkout chapter_15
```

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_15_solutions
```

## Chapter 16

In this chapter I introduce two very important concepts: the Lambdas and the Streams.

### Lambdas

To explain the Lambdas, I start with the method reference. The method reference is storing into a variable a reference
to a method. This way, I can run dynamically a method from a variable. The type of this variable will be Function (if
there are input values and output values), Consumer (if there are only input values) or Supplier (if there are only
output values). 

From the method reference, the Lambdas are just anonymous methods. I don't need to define a method to assign it to a
Function variable. I just declare the input parameters, write an arrow (->) and write the body inside the curly 
brackets.

### Streams

The streams are a flow of unbounded data. Comparing to the for loops, with the Streams I don't know (and I don't
care) about the length of the data. It may even be unlimited. With the streams, I can apply several operations using
the Lambdas. There are the intermediary operations and the terminal operations.

I can chain multiple intermediary operations but a single terminal operation. Intermediary operations are maps, filter,
limit and more. The terminal operations are count, average, collect and more. The terminal operations can return a list,
a map, a value (as a long or double) or an Optional.

The Optional is a new value type in Java which means that the value may be present or not.

To see the content, run from a terminal:
```
git checkout chapter_16
```

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_16_solutions
```

## Chapter 17

In this chapter, I explain the concurrent programming. I will show the common problems and the possible solutions.
I will explain the usage of the classes Thread and Runnable, Semaphore, the keyword syncrhonized, the Atomic objects.
Finally, I explain the CompletableFutures and how to chain them.

To see the content, run from a terminal:
```
git checkout chapter_17
```

You will have exercises/tests to test your knowledge by running `mvn test`
from the root folder of the project. If you want to see the answers, run
from a terminal:
```
git checkout chapter_17_solutions
```
