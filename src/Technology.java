package src;
import java.util.*;

public class Technology {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        String str= scan.nextLine(); 
        scan.close();
        int N = Integer.parseInt(n);
        String[] arrStr = str.split("\\s+");
        ArrayList<Integer> competency = new ArrayList<Integer>();
        for (int i = 0; i<N; i++) {
            competency.add(Integer.parseInt(arrStr[i]));
        }
        Collections.sort(competency);
        if (competency.get(0)==competency.get(competency.size()-1))
            System.out.println(-1);
        else {
            Integer res = 0;
            Integer minn = Integer.MAX_VALUE;
            for (int i = 1; i<N; i++) {
                res += (competency.get(i)-competency.get(i-1));
                if (competency.get(i)-competency.get(i-1)>0)
                    minn = Math.min(minn,(competency.get(i)-competency.get(i-1)));
            }
            System.out.println(res + minn);
        }
    }
}
