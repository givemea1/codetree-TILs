import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0 ; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}