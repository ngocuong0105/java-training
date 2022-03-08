package src;

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

    // Main method serves as entry point
    public static void main(String[] args) {
        Baby kuny = new Baby("Kuny",true,2);
        Baby maya = new Baby("Maya",false,1);
        Baby maya2 = new Baby("Maya",false,1);
        System.out.println(maya==maya2);
        System.out.println(maya.cry());
        System.out.println(maya.numPoops);
        System.out.println(kuny.cry());
        System.out.println(Baby.numBabiesMade);
        // Running from terminal
        // got to src folder and compile java file j-> avac Baby.java
        // run compiled file -> java Baby.java blah
        System.out.println(args[0]);
    }
}
