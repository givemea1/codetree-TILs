import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Integer[] arr = new Integer[n];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);


        System.out.println(arr[1] + arr[arr.length-2]);
    }
}