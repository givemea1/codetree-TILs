import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t1 = sc.nextInt();
        int m1 = sc.nextInt();
        int t2 = sc.nextInt();
        int m2 = sc.nextInt();

        int cost = 0;
        while(true){
            if(t1 == t2 && m1 == m2){
                break;
            }
            cost++;
            if(m1 == 60){
                m1 = 1;
                t1++;
                continue;
            }
            m1++;
            
        }

        System.out.println(cost);
    }
}