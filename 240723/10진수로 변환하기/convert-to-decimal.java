import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        int idx = 0;

        while(true){
            if(n == 0){
                break;
            }

            sum += (n % 10) * Math.pow(2,idx);
            n = n / 10; 
            idx++;
        }

        System.out.println(sum);
    }
}