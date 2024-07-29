import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static int m;
    public static int[][] graph;
    public static int[] visit;
    public static int cnt = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visit = new int[n+1];
        graph = new int[n+1][n+1];

        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = graph[y][x] = 1;
        }
        dfs(1);
        System.out.println(cnt);
    }

    public static void dfs(int start){
        visit[start] = 1;

        for(int i = 1; i < n+1; i++){
            if(visit[i] == 0 && graph[start][i] == 1){
                visit[i] = 1;
                cnt++;
                dfs(i);
            }
        }
        
    }
}