import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        StringBuilder sb= new StringBuilder(); 

        while(true){
            if(n/1 == 0 || n/1 == 1){
                sb.append(n/1);
                break;
            }
            sb.append(n%2);
            n = n / 2;
        }
        System.out.println(sb.reverse());

    }
}