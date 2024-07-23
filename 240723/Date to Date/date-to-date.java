import java.util.*;

public class Main {
    public static int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int count = 1 ;

        while(true){
            if(m1 == m2 && d1 == d2){
                break;
            }
            count++;

            if(d1 == days[m1]){
                m1++;
                d1 = 1;
                continue;
            }

            d1++;
        }

        System.out.println(count);
    }
}