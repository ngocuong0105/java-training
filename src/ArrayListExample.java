package src;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Mama");
        strings.add("ti");
        strings.add("stara");
        System.out.println(strings.size());
        System.out.println(strings.get(0));
        strings.set(0,"Goodbye");
        System.out.println(strings.get(0));
        strings.remove(1);
        System.out.println(strings);
    }
}
