import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ten = to10(n);
        ten *= 17;
        
        System.out.println(to2(ten));
    }

    public static String to2(int num){
        StringBuilder sb = new StringBuilder();

        while(true){
            if(num/2 == 0 || num/2 ==1){
                sb.append(num%2);
                sb.append(num/2);
                return sb.reverse().toString();
            }
            sb.append(num%2);
            num = num/2;
        }
    }

    public static int to10(int num){
        int sum = 0;
        int idx = 0;
        while(true){
            if(num == 0){
                return sum;
            }
            sum += (num % 10 ) * Math.pow(2,idx);
            num /=10;
            idx++;
        }
    }
}