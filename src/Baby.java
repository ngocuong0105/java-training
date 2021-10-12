package src;
// • Class names are Capitalized
// • 1 Class = 1 file
// • Having a main method means the class can be run
// JAVA Types 
// • Primitive types are basic java types
// – int, long, double, boolean, char, short, byte, float
// – The actual values are stored in the variable

// • Reference types are arrays and objects
// – String, int[], Baby, ...

// How java stores primitives
// • Variables are like fixed size cups
// • Primitives are small enough that they just fit
// into the cup

// How java stores objects
// • Objects are too big to fit in a variable (too big for the cup)
// – Stored somewhere else
// – Variable stores a number that locates the object
// • The object’s location is called a reference

// Static and non Static methods
// • Applies to fields and methods !!!!!!
// • Means the field/method
// – Is defined for the class declaration,
// – Is not unique for each instance
// Java main() method is always static, so 
// that compiler can call it without the creation of an 
// object or before the creation of an object of the class. 
// In any Java program, the main() method is the starting point 
// from where compiler starts program execution. 
// So, the compiler needs to call the main() method.

public class Baby {
    // Fields (setting their type)
    String name;
    boolean isMale;
    int numPoops;
    Baby[] siblings;
    static int numBabiesMade = 0; // static field

    // Constructor
    Baby(String myname, boolean maleBaby, int poops) {
        name = myname;
        isMale = maleBaby;
        numPoops = poops;
        numBabiesMade += 1;
    }

    // Method
    public String cry() {
        return "My name is " + this.name + " and I cry"; //this is same as python self
    }
    public static void main(String[] args) {
        Baby kuny = new Baby("Kuny",true,2);
        Baby maya = new Baby("Maya",false,1);
        Baby maya2 = new Baby("Maya",false,1);
        System.out.println(maya==maya2);
        System.out.println(maya.cry());
        System.out.println(maya.numPoops);
        System.out.println(kuny.cry());
        System.out.println(Baby.numBabiesMade);
    }
}
