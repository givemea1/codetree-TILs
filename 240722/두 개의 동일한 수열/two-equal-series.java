import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Integer[] arr1 = new Integer[n];
        Integer[] arr2 = new Integer[n];

        for(int i = 0 ; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i = 0 ; i<arr1.length; i++){
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(Arrays.deepEquals(arr1,arr2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}