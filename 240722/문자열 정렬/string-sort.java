import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] arr = str.toCharArray();

        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length ;  i++){
            System.out.print(arr[i]);
        }

        // 여기에 코드를 작성해주세요.
    }
}