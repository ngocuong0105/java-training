package src;
import java.util.ArrayList;

public class ArrayListExample {
    /**
     *  ArrayList in Java is used to store dynamically sized collection of elements, same as list in python.
     * ArrayList accepts only reference types as its element, not primitive datatypes. 
     * When trying to do so it produces a compile time error.
     */
    public static ArrayList<String> main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Mama");
        strings.add("ti");
        strings.add("stara");
        System.out.println(strings.size());
        System.out.println(strings.get(0));
        strings.set(0,"Baba");
        System.out.println(strings.get(0));
        strings.remove(1);
        System.out.println(strings);
        strings.add("li");
        strings.add("e");
        System.out.println(strings);
        System.out.println(strings.subList(1, 3));
        return strings;
    }
}
