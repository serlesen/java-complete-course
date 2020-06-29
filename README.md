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
