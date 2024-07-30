import java.util.*;
import java.io.*;

public class Main {
    public static int n ;
    public static ArrayList<Integer> arr = new ArrayList();
    public static int cnt=0; 

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        recursive(1);
        System.out.println(cnt);
    }

    public static boolean validate(){
        for(int i = 0; i < n ; i+=arr.get(i)){
            if(i+arr.get(i)-1 >= n){
                return false;
            }
            for(int j = i; j<i+arr.get(i); j++){
                if(arr.get(i) != arr.get(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void recursive(int num){
        if(num == n+1){
            if(validate()){
                cnt++;
            }
            return;
        }

        for(int i = 1; i<=4;i++){
            arr.add(i);
            recursive(num+1);
            arr.remove(arr.size()-1);
        }

    }
}