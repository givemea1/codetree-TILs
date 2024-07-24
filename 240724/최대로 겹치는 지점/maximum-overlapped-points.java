import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr= new int[100+1];

        for(int i = 0 ; i < n ; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();

            for(int j = s; j<=e; j++){
                arr[j]++;
            }
        }

        int max = arr[0];
        for(int i = 1 ; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}