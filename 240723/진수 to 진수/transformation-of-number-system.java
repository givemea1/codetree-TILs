import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int n = sc.nextInt();

        int ten = toTen(n, a);
        System.out.println(toB(ten,b));
    }

    public static String toB(int num, int b){
        StringBuilder sb = new StringBuilder();

        while(true){
            if(num == 0){
                return sb.reverse().toString();
            }
            if(num == 1){
                sb.append(1);
                return sb.reverse().toString();
            }
            sb.append(num % b);
            num /=b;
        }

    }

    public static int toTen(int num, int a){
        int idx = 0;
        int sum = 0;
    
        while(true){
            if(num == 0){
                return sum;
            }
            sum += (num % 10) * (int)Math.pow(a, idx);
            num = num / 10;
            idx++;
        }
    }
}