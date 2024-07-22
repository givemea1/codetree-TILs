import java.util.*;

public class Main {
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        arr = new int[num];

        for(int i = 0 ; i< num; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(f(num));
    }

    public static int f(int n){
        if(n==1){
            return gc(arr[n-1], arr[n-1]);
        }
        return gc(arr[n-1], f(n-1));
    }

    public static int gc(int a, int b){
        for(int i = Math.max(a,b); i<=a*b; i++){
            if(i % a == 0  && i % b == 0){
                return i;
            }
        }
        return 0;
    }
}