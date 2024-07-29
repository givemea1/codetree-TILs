import java.util.*;
import java.io.*;

public class Main {
    public static int[] dx = new int[]{1,0};
    public static int[] dy = new int[]{0,1};
    public static int n ;
    public static int m ;
    public static int[][] graph;
    public static int[][] visit;
    public static boolean status;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visit = new int[n][m];

        for(int i = 0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0);
        if(status){
            System.out.print(1);
        }else{
            System.out.println(0);
        }
        
    }

    public static void dfs(int r, int c){
        if(r == n-1 && c == m-1){
            status = true;
            return;
        }
        visit[r][c] = 1;
        for(int i = 0; i<dx.length; i++){
            int nr = r + dx[i];
            int nc = c + dy[i];

            if(nr <0 || nc < 0 || nr >= n || nc >= m){
                continue;
            }
            if(graph[nr][nc] == 1 && visit[nr][nc] == 0){
                visit[nr][nc] = 1;
                dfs(nr,nc);
            }
        }
    }
}