package src;
import java.util.*;
public class Ship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] arrStr = str.split("\\s+");
        Integer W = Integer.parseInt(arrStr[0]);
        Integer H = Integer.parseInt(arrStr[1]);
        Integer N = Integer.parseInt(arrStr[2]);
        Integer R = Integer.parseInt(arrStr[3]);
        
    }
    public double dist(int[] x, int[] y) {
        double d = Math.pow(Math.pow(x[0]-y[0],2) + Math.pow(x[1]-y[1],2),0.5);
        return d;
    } 
}
