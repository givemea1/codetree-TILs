import java.util.*;

public class Main {

    public static int[] days = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input_m1 = sc.nextInt();
        int input_d1 = sc.nextInt();
        int input_m2 = sc.nextInt();
        int input_d2 = sc.nextInt();

        int m1 ;
        int d1 ;
        int m2 ;
        int d2 ;

        int count = 0;

        if((input_m1 < input_m2) ||(input_m1==input_m2 && input_d1<input_d2) ){
            m1 = input_m1;
            d1 = input_d1;
            m2 = input_m2;
            d2 = input_d2;
            while(true){
                if(m1 == m2 && d1 == d2){
                    break;
                }
                count++;
                if(d1 == days[m1]){
                    m1++;
                    d1 = 1;
                }
                d1++;
            }
            if(count % 7 == 0){
                System.out.println("Mon");
            }else if(count % 7 == 1){
                System.out.println("Tue");
            }
            else if(count % 7 == 2){
                System.out.println("Wen");
            }
            else if(count % 7 == 3){
                System.out.println("Thu");
            }
            else if(count % 7 == 4){
                System.out.println("Fri");
            }
            else if(count % 7 == 5){
                System.out.println("Sat");
            }else{
                System.out.println("Sun");
            }
        }else{
            m1 = input_m2;
            d1 = input_d2;
            m2 = input_m1;
            d2 = input_d1;  
            while(true){
                if(m1 == m2 && d1 == d2){
                    break;
                }
                count++;
                if(d1 == days[m1]){
                    m1++;
                    d1 = 1;
                }
                d1++;
            }
            if(count % 7 == 0){
                System.out.println("Mon");
            }else if(count % 7 == 1){
                System.out.println("Sun");
            }
            else if(count % 7 == 2){
                System.out.println("Sat");
            }
            else if(count % 7 == 3){
                System.out.println("Fri");
            }
            else if(count % 7 == 4){
                System.out.println("Thu");
            }
            else if(count % 7 == 5){
                System.out.println("Wen");
            }else{
                System.out.println("Tue");
            }
        }
    }
}