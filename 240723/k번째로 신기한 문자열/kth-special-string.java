import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String word = sc.next();

        int count = 0;
        
        String[] arr = new String[n];

        for(int i = 0; i<n;i++){
            String str = sc.next();
            if(str.contains(word)){
                arr[count] = str;
                count++;
            }
        }
        Arrays.sort(arr,0,count+1);

        System.out.println(arr[k-1]);
    }
}