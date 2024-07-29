import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int[] dx = new int[]{1,0,-1,0};
    public static int[] dy = new int[]{0,1,0,-1};
    public static int[][] graph;
    public static int[][] visit;
    public static int blockCnt = 0;
    public static int blockSize = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        graph = new int[n][n];
        visit = new int[n][n];

        for(int i = 0; i< n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n;j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 1;

        for(int i = 0 ; i< n; i++){
            for(int j = 0;j<n;j++){
                if(visit[i][j] == 0){
                    blockSize = 0;
                    dfs(i,j,graph[i][j]);
                    if(blockSize > 0 && blockSize > 4){
                        blockCnt++;
                    }
                    if(blockSize > max){
                        max = blockSize;
                    }
                }
            }
        }
        System.out.println(blockCnt+" " +max);
    }

    public static void dfs(int r, int c, int b){
        for(int i = 0 ; i < dx.length; i++){
            int nr = r + dx[i];
            int nc = c + dy[i];

            if(nr<0 || nc<0||nr>=n||nc>=n){
                continue;
            }
            if(graph[nr][nc] == b && visit[nr][nc] == 0){
                visit[nr][nc] = 1;
                blockSize++;
                dfs(nr, nc, b);
            }
        }
        
    }
}