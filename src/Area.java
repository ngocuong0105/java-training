package src;

import java.util.Scanner;
import java.util.*;


public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine(); 
        scan.close();
        String[] arrStr = str.split("\\s+");
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Integer> c = new ArrayList<Integer>();
        ArrayList<Integer> d = new ArrayList<Integer>();
        for (int i = 0; i<8; i++) {
            if (i<2) {
                a.add(Integer.parseInt(arrStr[i]));
            }
            else if (i<4) {
                b.add(Integer.parseInt(arrStr[i]));
            }
            else if (i<6) {
                c.add(Integer.parseInt(arrStr[i]));
            }
            else if (i<8) {
                d.add(Integer.parseInt(arrStr[i]));
            }
        }
        Float res = (float) (((a.get(0)*b.get(1)-a.get(1)*b.get(0))+(b.get(0)*c.get(1)-b.get(1)*c.get(0))+(c.get(0)*d.get(1)-c.get(1)*d.get(0))+(d.get(0)*a.get(1)-d.get(1)*a.get(0)))/2.0);
        System.out.println(Math.abs(res));

    }
}
