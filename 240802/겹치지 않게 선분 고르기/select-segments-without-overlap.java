import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static int n ;
    public static int[][] arr;
    public static ArrayList<int[]> selected = new ArrayList<>();
    public static int max=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n][2];

        for(int i = 0 ; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            arr[i] = new int[]{x1,x2};
        }

        recursive(0);
        System.out.println(max);
    }

    private static void recursive(int cnt) {
        if(cnt == n){
            if(possible()){
                max = Math.max(max,selected.size());
            }
            return;
        }
        selected.add(arr[cnt]);
        recursive(cnt+1);
        selected.remove(selected.size()-1);
        recursive(cnt+1);
    }

    private static boolean possible() {
        for(int i = 0; i < selected.size(); i++){
            for(int j = i+1; j<selected.size(); j++){
                int[] select1 =selected.get(i);
                int[] select2 = selected.get(j);
                if(select1[1] > select2[0] || select1[1] > select2[1]){
                    return false;
                }
            }
        }
        return true;
    }
}