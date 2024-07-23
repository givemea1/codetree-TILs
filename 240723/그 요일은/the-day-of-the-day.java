import java.util.*;

public class Main {

    public static int[] days = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String word = sc.next();

        int count = 0;
        while(true){
            if(d1 == d2 && m1 == m2){
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

        int remain = count % 7;
        
        int dayNum = changeDay(word);

        if(remain > dayNum){
            System.out.println(count/7);
        }else{
            System.out.println((count) / 7 +1);
        }

        

        
    }

    public static int changeDay(String word){
        if(word.equals("Mon")){
            return 0;
        }else if(word.equals("Tue")){
            return 1;
        }
        else if(word.equals("Wed")){
            return 2;
        }
        else if(word.equals("Thu")){
            return 3;
        }
        else if(word.equals("Fri")){
            return 4;
        }
        else if(word.equals("Wen")){
            return 5;
        }
        else{
            return 6;
        }
    }
}