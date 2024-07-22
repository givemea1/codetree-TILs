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
            if(str.startsWith(word) && str.length() >= word.length()){
                arr[count] = str;
                count++;
            }
        }


        Arrays.sort(arr,0,count);



        System.out.println(arr[k-1]);
    }
}