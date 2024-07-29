import java.util.*;
import java.io.*;

public class Main {
    public static int n,m;
    public static int[] dx = new int[]{1,0,-1,0};
    public static int[] dy = new int[]{0,1,0,-1};
    public static int[][] graph;
    public static int[][] visit;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph=new int[n][m];
        visit=new int[n][m];

        for(int i = 0; i< n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m;j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs(0,0);
        System.out.println(visit[n-1][m-1]);
    }
    public static void bfs(int r, int c){
        Queue<int[]> q = new LinkedList();
        q.add(new int[]{r,c});
        visit[r][c] = 1;

        while(!q.isEmpty()){
            int[] curr = q.poll();
            for(int i = 0 ; i < dx.length; i++){
                int nr = curr[0] + dx[i];
                int nc = curr[1] + dy[i];

                if(nr<0 || nc<0 || nr>=n || nc>=m){
                    continue;
                }

                if(graph[nr][nc] == 1 && visit[nr][nc] == 0){
                    visit[nr][nc] = 1;
                    q.add(new int[]{nr,nc});
                }
            }
        }
    }
}