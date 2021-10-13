## Getting Started with Java

Blah blah, I am learning Java.

## Java in a nutshell
Java works by first compiling the source code (.java files) into bytecode (.class files). Then, the bytecode can be compiled into machine code with the Java Virtual Machine (JVM). Java’s bytecode can run on any device with the JVM which is why Java is known as a "write once, run anywhere" language. Hence:  
- .class -> compiled (for JVM)
- .java -> source (for humans)
You compile a java file into a class file by going to the command line, navigating to the .java file, and running

```
javac "c:\the\path\to\your\file\yourFileName.java"
```
Then to run (.class) file, write in terminal:
```
java yourFileName.java
```

When Java was created in 1995, it was modeled after C++. There are some similarities in these languages and some differences. Of course, the syntax is different. However, the main difference lies in how the code is executed. Unlike Java, which is compiled into bytecode, which can then run on any device that has the JVM, C++ is compiled directly into machine code. This is why Java is famously known to be "Write once, run anywhere."
When a program written in C++ is compiled, that compiled code can only run that environment. In order for the same program to run on another environment, the source code must be transferred to that environment and then compiled. This is one of the advantages that Java has over other languages (such as Python where you have many dependencies when using libraries). Also Java is better isolated from the OS. 

## Difference between JDK, JRE, and JVM

### The JVM and Machine Code

We’ve already established that C++ only runs on the environment in which it was compiled. JVM (Java Virtual Machine) is an abstract machine. It is called a virtual machine because it doesn't physically exist. The Java Virtual Machine provides the runtime environment needed for Java to work on virtually any computer. Once the Java program is compiled into bytecode, it can then be interpreted into machine code through the JVM. It can also run those programs which are written in other languages and compiled to Java bytecode. The JVM performs the following main tasks:
- Loads code
- Verifies code
- Executes code
- Provides runtime environment

### JRE
The Java Runtime Environment is a set of software tools which are used for developing Java applications. It is used to provide the runtime environment. It is the implementation of JVM. It physically exists. It contains a set of libraries + other files that JVM uses at runtime.
The JRE is the Java Runtime Environment. It is a package of everything necessary to run a compiled Java program, including the Java Virtual Machine (JVM), the Java Class Library, the java command, and other infrastructure. However, it cannot be used to create new programs.

### JDK
The JDK is the Java Development Kit, the full-featured SDK for Java. It has everything the JRE has, but also the compiler (javac) and tools (like javadoc and jdb). It is capable of creating and compiling programs. Usually, if you only care about running Java programs on computer you will only install the JRE. It's all you need. On the other hand, if you are planning to do some Java programming, you need to install the JDK instead. 

### Summary
The JVM is the Java platform component that executes programs.  
The JRE is, as the name implies, an environment. It's basically a bunch of directories with   Java-related files and is the on-disk part of Java that creates the JVM.  
The JDK allows developers to create Java programs that can be executed and run by the JVM and JRE.

See more info about your java:
```
java -XshowSettings:properties -version
```

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Java Packages

In Java, the package is the collection of Java classes and interfaces. When we use the classes of a particular package, we need to import that particular package in which that classes are defined. The class uses the fully qualified name that includes the package name. In most of the basic Java programs, we do not import any package. 
Java compiler imports java.lang package internally by default. It provides the fundamental classes that are necessary to design a basic Java program. The important classes are Object, which is the root of the class hierarchy, and Class, instances of which represent classes at run time.

"package" is also a keyword in Java that is used to specify a directory structure for the particular class file, but at the same time, it is also used to control access. 
You can use a package to organize code in a meaningful directory for better navigation.
"package"  declares a 'name space' for the Java class. It must be put at the top of the Java file, it should be the first Java statement line. To ensure that the package name will be unique across vendors, usually the company url is used starting in backword. 

Packages are just directories and classes in other packages/folders need to be imported. Each class belongs to a package and classes in the same package serve a similar purpose. All classes “see” classes in the same package hence no import needed.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Standard Coding Style Guidelines.
### Naming
- Variables: Nouns, lowercase first letter, capitals separating words, e.g x, shape, highScore, fileName
- Methods: Verbs, lowercase first letter, e.g getSize(), draw(), drawWithColo()  
- Classes: Nouns, uppercase first letter, e.g. Shape, WebPage, EmailAddress  

### Good Class Design
- Good classes: easy to understand and use  
• Make fields and methods private by default  
• Only make methods public if you need to  
• If you need access to a field, create a method:  
public int getBar() { return bar; }

### Assertions
Verify that code does what you expect
If true: nothing happens  
If false: program crashes with error, e.g
assert result >= 0;

### Java Interfaces
Manipulate objects, without knowing how they work
Useful when you have similar but not identical objects
Useful when you want to use code written by others
Interfaces are set of classes that share methods
Declare an interface with the common methods
Can use the interface, without knowing an objectʼs specific type

### Interface Notes
Only have methods (mostly true)
Do not provide code, only the definition (called signatures)
A class can implement any number of interface