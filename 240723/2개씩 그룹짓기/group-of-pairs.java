import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Integer[] arr = new Integer[n*2];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, 0 , 2*n);

        int max = 0;
        for(int i = 0 ; i < arr.length; i++){
            int groupSum = arr[i] + arr[arr.length-1 -i];
            if(groupSum > max){
                max = groupSum;
            }
        }
        System.out.println(max);
    }
}