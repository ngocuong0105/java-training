package src;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class bro_tutorial {
    public static void main(String[] args){
        /*
         ------------PRINTING------------
        */
        // printing new line
        System.out.println(69);
        // printing same line
        System.out.print("I love burgers");
        System.out.print(" and pizza \n");
        // escape sequences 
        // newline \n
        // tab \t
        // if you want to print "  use \"
        System.out.print("Yummy!");
        /*
        *------------Variables------------
        */
        // Basic  varaibles
        int x; // declaration
        x = 123; //assignment
        int y = 312313132; // initialization = declaration + assignment
        System.out.println(x);
        System.out.println(y);

        long z = 312319873113L; // need to add L in the end!
        System.out.println(z);
        
        float t = 31.9f; // need to add f
        System.out.println(t);

        double tt = 31.102; // more precision that float
        System.out.println(tt);

        char symbol = 'S';
        System.out.println(symbol);

        String fullname = "Ngo Cuong";
        System.out.println(fullname);
        // getting specific character of a string
        System.out.println(fullname.charAt(0));

        // Swapping varaibles
        String water = "water";
        String beer = "beer";
        String temp;
        temp = water;
        water = beer;
        beer = temp;
        System.out.println(water);
        System.out.println(beer);

        // Accept user input
        // Reading string
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("What is you name? ");
        // String name = scanner.nextLine();
        // System.out.println("Hello "+name);
       
        // System.out.println("How old are you?"); 
        // int age = scanner.nextInt();
        // System.out.println("You are " + age);
        // scanner.nextLine(); // without this it fails and would not include food
        
        // System.out.println("What's you favourite food"); 
        // String food = scanner.nextLine();
        // System.out.println(food + " is yummy");

        // scanner.close();

        /*
         * ------------Expressions------------
         */
        // expression = operands & operations
        // operands = values, varaibles, numbers, quantity
        // operators = + - * / %

        // Ternary operator
        // condition ? exprIfTrue : exprIfFalse
        int a = 10;
        int b = 3;
        System.out.println((a>b) ? "Yes":"No");
        // equivalent to
        if (a>b) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        // integer division truncates the remainder
        int friends = 10;
        double casted_group = (double) friends/3;// casting variable
        System.out.println(casted_group);
        System.out.println(friends/3); 


        /**
         * ---------------Math--------------
         */
        double var1 = 3.14;
        double var2 = -10;
        double maxx = Math.max(var1,var2);
        double root = Math.sqrt(var1);
        double absolute = Math.abs(var2*var1);
        double rounded = Math.round(var1);
        double upp = Math.ceil(var1);
        double downn = Math.floor(var1);


        System.out.println(maxx);
        System.out.println(root);
        System.out.println(absolute);
        System.out.println(rounded);
        System.out.println(upp);
        System.out.println(downn);

         /**
         * ---------------Random numbers--------------
         */
        Random random = new Random();
        int x_random = random.nextInt();
        System.out.println(x_random);

        int die = random.nextInt(7);
        System.out.println(die);

        double y_random = random.nextDouble(); // random between 0 and 1
        System.out.println(y_random);

        /**
         * ----------------If else statements-------------
         */
        int my_age = 19;
        if (my_age >= 18) {
            System.out.println("You can drink alcohol legally!");
        }
        else {
            System.out.println("You are not allowed to drink alcohol!");
        }


        /*
         * -------------- Arrays --------------
         */

         // array is used to store multiple values in a single variable
        String car = "camaro";
        // arrays are defined by defining the type adding square brackets [] and when defining it should use curly brackets{}
        String[] cars = {"Camaro","Mercedes","Tesla"};
        System.out.println(cars[0]);

        // Lists require a predefined allocated memory
        String[] carss = new String[3];
        carss[0] = "KUR";
        carss[1] = "Corvette";
        carss[2] = "Tesla";

        for (int i=0; i<carss.length; i++) {
            System.out.println(carss[i]);
        }

        /*
         * -------------- ArrayLists --------------
         */
        // Array lists are dynamic type lists - grows and shrinks as you want
        // in order to get an element need to use the method get, cannot just index
        // Methods:
        // .remove("Strawberry")
        // .add("Monkey")
        // .clear()
        // .contains
        // These methods are not available for normal Arrays such as String[]
        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Orange");
        fruitList.add("Strawberry");
        fruitList.add(1);
        System.out.println(fruitList);

        for (int i=0; i<fruitList.size(); i++) {
            System.out.println(fruitList.get(i));
            System.out.println(fruitList.get(i).getClass().getSimpleName());
        }
        // Below we store only strings in the array and VS Code won't complain
        // ArrayList<String> fruitList = new ArrayList<String>();
        // fruitList.add("Mango");
        // fruitList.add("Apple");
        // fruitList.add("Orange");
        // fruitList.add("Strawberry");
        // System.out.println(fruitList);

    }
}

        /*
         * -------------- HashMaps --------------
         */
        // Hashmaps cannot hash primitive types