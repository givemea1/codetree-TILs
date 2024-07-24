import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr= new int[200+1];

        for(int j = 0; j< n ; j++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            for(int i = s; i < e; i++){
                arr[i+100]++;
            }
        }

        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}