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

    public static boolean validate(String s){
        for(int i = 0; i < n ; i+=Integer.parseInt(String.valueOf(s.charAt(i)))){
            if(i+Integer.parseInt(String.valueOf(s.charAt(i)))-1 >= n){
                return false;
            }
            for(int j = i; j<i+Integer.parseInt(String.valueOf(s.charAt(i))); j++){
                if(Integer.parseInt(String.valueOf(s.charAt(j))) != Integer.parseInt(String.valueOf(s.charAt(i)))){
                    return false;
                }
            }
        }
        return true;
    }

    public static void recursive(int num){
        if(num == n+1){
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i<arr.size(); i++){
                sb.append(arr.get(i));
            }
            if(validate(sb.toString())){
                cnt++;
            }
            return;
        }

        for(int i = 1; i<=n;i++){
            arr.add(i);
            recursive(num+1);
            arr.remove(arr.size()-1);
        }

    }
}