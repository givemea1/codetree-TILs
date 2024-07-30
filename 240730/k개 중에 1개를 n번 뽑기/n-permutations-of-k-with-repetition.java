import java.util.*;
import java.io.*;

// K개 중 하나를 n번 선택하기

public class Main {
    public static int k,n;
    public static ArrayList<Integer> arr = new ArrayList();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        recursive(1);
    }

    public static void recursive(int num){
        if(num == n+1){
            for(int i = 0; i<arr.size(); i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
            return;
        }
        for(int i = 1; i<=k;i++){
            arr.add(i);
            recursive(num+1);
            arr.remove(arr.size()-1);
        }
    }
}