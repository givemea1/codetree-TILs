import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println(method(n1*n2*n3));

        
    }

    public static int method(int n){
        if(n == 0){
            return 0;
        }

        return (n % 10) + (method(n/10));
    }
}