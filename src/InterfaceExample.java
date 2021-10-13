package src;

interface WaterBottleInterface {
    String color = "Blue";
    
    // default keyword if you do not implemet fillup bellow it would give this
    default void fillUp(){
        System.out.println("Water bottl fill up");
    }
}

public class InterfaceExample implements WaterBottleInterface{
    public static void main(String[] args) {
        System.out.println(color);
        InterfaceExample ex = new InterfaceExample();
        ex.fillUp();
    }

    // need to add this method as we are using the WaterBottleInterface interface
    @Override
    public void fillUp() {
        System.out.println("Imash vodica");
    }
}
