package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// Example of Counting Sort
// public class need to be named test
public class test{
    public static void main(String[] args){
        // ArrayList in Java is used to store dynamically sized collection of elements
        // same as list in python
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(4,1,32,15,96,42,7,15));
        numbers.add(13);
        int[] counts = new int[101];
        for (int number : numbers) {
            counts[number]++;
        }
        for (int number = 0; number<100; number++){
            int count = counts[number];
            for (int i=0; i<count; i++){
                System.out.print(number+ " ");
            }
        }
    }

}

// ArrayList complexities
// size(),isEmpty(),get(),set() - O(1)
// add() is O(1) amortised
// Implemented with table doubling
//

// no need to name it as the java filename
class sss{
    public static void main(String[] args){
        int n=100;
        long j=10000000000000000L; //need to specify L as a suffix
        // There are specific suffixes for long (e.g. 39832L), float (e.g. 2.4f) and double (e.g. -7.832d).
        // The Java spec allows both upper and lower case suffixes, but the upper case version
        // for longs is preferred, as the upper case L is less easy to confuse with a numeral 1 than the lower case l.
        for  (int i=0;i<n;i++){
            System.out.println(j);
            j++;
        }
    }

}
// START of the journey to learn Java.

class Hello{

    // main() is a special method
    // "special chunk of code which is ran when you hit the ran button"
    // main method is always with lower case
    public static void main(String[] arguments){
        // Program execution begins here
        // '' does not work in java
        System.out.println("Hello World!");
        System.out.println("Zdr bebce, kp"); 
        // prinln is for print new line, normal print prints on same line
        // System.out.println(some String) outputs  to the console
    }

}
// Program Structure
// class CLASSNAME {
//     public static void main(String[] arguments) {
//     STATEMENTS
//     }
// }

// public static = static public

// Can I just create the program directly the way I do it in other languages?
// No.
// I mean is the concept of class necessary in Java?
// Yes. Every method, field etc is always in a class (or interface).
// Yes, that's an overhead for tiny programs - but for larger programs, the impact is pretty tiny.
// Java is a class-based and object-oriented programming language.
// This main focus is about encapsulating data and behavior into objects.


// Java project structure.
// See README file, note on the left there is JAVA PROJECTS

// What is the main feature of a POM file and why is it actually used?
// A Project Object Model or POM is the fundamental unit of work in Maven. 
// It is an XML file that contains information about the project and configuration details 
// used by Maven to build the project. It contains default values for most projects. 
// Examples for this is the build directory, which is target; the source directory, which is src/main/java;
// the test source directory, which is src/main/test; and so on.

// How will the dependencies get mapped to the Java virtual machine 
// whatever we give in it and become flexible on application?

// When executing a task or goal, Maven looks for the POM in the current directory.
// It reads the POM, gets the needed configuration information, then executes the goal.


// Maven is a Java tool, so you must have Java installed in order to proceed.
// What is Maven? The result is a tool that can now be used for building and managing any Java-based project.//
// We hope that we have created something that will make the day-to-day
// work of Java developers easier and generally help with the comprehension of any Java-based project.

// From what I can gather, Maven is a project environment management tool such that 
//your projects are organised in a specific way such that the
// Java compiler can be easily configured to find all the relevant bits. 
// Maven is somthing like the virtual environments in Python?




// Variable in Java:
// Form: Type Name;
// Example: String foo;
// Java is statically-typed, so it expects its variables to be declared before they can be assigned values. 
// Python is a dynamically typed language.
// That means it is not necessary to declare the type of a variable when assigning a value to it.
// Java verifies that types always match:


// 1. Variable assignment as usual using =
// 2. Assignment can be combined with a variable declaration
// 3. Void functions are created and used just like value-returning
// functions except they do not return a value after the function executes. 
class assignment{
    public static void main(String[] arguments){ // 3
        String foo;
        foo = "Kur"; // 1
        double badPi = 3.14; //2
        foo = "Po-golqm Kur"; // reassign foo
        System.out.println(foo);
        System.out.println(badPi);
    }
}

class doMath{
    public static void main(String[] arguments){
        double a = 3.14;
        System.out.println(a);
        double copy = a; // deep copy
        copy = copy/2.0;
        System.out.println(a);
        System.out.println(copy);

        double real1 = 4;
        double real2 = 3;
        int num1 = 6;
        int num2 = 5;
        // %f is for floating point
        System.out.println(String.format("Real division %f", real1/real2));
        // %d is for integer, decimal integer
        System.out.println(String.format("Integer division %d", num1/num2));
    }
}
// Division (“/”) operates differently on integers and on doubles! 
class str_ops{
    public static void main(String[] arguments){
        String text = "hello" + "world";
        text = text + "number" +5;
        System.out.println(text);
    }
}

// Conversion by Casting
class conv_type{
    public static void main(String[] arguments){
        int a = 2; // a = 2
        double b = 2; // a =2.0 (Implicit)
       // int c = 18.7; // ERROR
        int d = (int)18.7; // a = 18
        double e = 2/3; // a = 0.0
        double f = (double)2/3; // a = 0.6666…

    }
}

// public static void  are some key words which define a method
// methods make code more readable and reusable
class Methods{
    public static void main(String[] arguments){
        multiply(5,10);
        welcome();
        multiply(10,3);
        int sum=add(4,5);
        System.out.println(String.format("Sum is %d",sum));
        // user input read:
        divide();
    }

    // defining another method
    // void means nothing, does not return nothing
    public static void multiply(int a, int b){
        System.out.println(a*b);
    }
    public static void welcome(){
        System.out.println("ZDR Bitch");
    }

    // methods with return statements
    public static int add(int a, int b){
        return a+b;
    }
    public static void divide(){
    // reading user input
    // Java Scanner class allows the user to take input from the console.
    // It belongs to java.util package. It is used to read the input of primitive types like int, double, long, short, float, and byte.
    // It is the easiest way to read input in Java program.
    Scanner scanner = new Scanner(System.in);
    // scanner is object of type Scanner.
    // nextLine is a method of the Scanner class.
    // scanner can be used to read more than 1 input.
    String text = scanner.nextLine(); // nextLine to read string.
    double num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    System.out.println(text);
    double res = num1/num2;
    System.out.println(String.format("Division result: %f", res));
    // need to close scanner to avoid warning
    scanner.close();
    }
    
    
    
 //The Java new keyword is used to create an instance of the class. In other words, it instantiates a // class by allocating memory for a new object and returning a reference to that memory.

}
