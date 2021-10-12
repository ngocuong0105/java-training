## Getting Started with Java

Blah blah, I am learning Java.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Standard coding style guidelines.
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