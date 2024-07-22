import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int count = 0;

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
            if(i == 0){
                System.out.print(arr[0]+" ");
                continue;
            }
            Arrays.sort(arr,0,count+1);
            if(i % 2 == 0){
                System.out.print(arr[(i+1)/2]+" ");
            }
        }


    }
}