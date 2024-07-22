import java.util.*;

public class Main {

    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        f(n);
        
        System.out.println(count);
    }

    public static void f(int n){
        if(n==1){
            return; 
        }
        count++;
        if(n % 2 == 0){
            f(n/2);
        }else{
            f(n*3+1);
        }
    }
}