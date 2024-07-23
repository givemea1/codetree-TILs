import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d1 = 11;
        int t1 = 11;
        int m1 = 11;


        int d2 = sc.nextInt();
        int t2 = sc.nextInt();
        int m2 = sc.nextInt();

        int count = 0;

        while(true){
            if(d1 == d2 && t1 == t2 && m1==m2){
                break;
            }else if(d1 != d2){
                count += 1440;
                d1++;
            }else if( d1 == d2 && t1 != t2 ){
                count += 60;
                if(t1 == 24){
                    d1++;
                    t1 = 0;
                    continue;
                }
                t1++;
            }else{
                count++;
                if(m1 == 60){
                    t1++;
                    m1 = 1;
                    continue;
                }
                m1++;
            }
        }
        System.out.println(count);
    }
}