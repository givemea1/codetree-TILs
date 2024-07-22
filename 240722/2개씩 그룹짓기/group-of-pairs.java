import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Integer[] arr = new Integer[n*2];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        Integer[] sum_arr = new Integer[n];

        for(int i = 0 ; i < sum_arr.length; i++){
            sum_arr[i] = arr[i] + arr[arr.length-1 -i];
        }

        Arrays.sort(sum_arr);

        System.out.println(sum_arr[0]);    
        
    }
}