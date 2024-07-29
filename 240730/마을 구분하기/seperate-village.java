import java.util.*;
import java.io.*;

public class Main {
    public static int n ;
    public static int[] dx = new int[]{1,0,-1,0};
    public static int[] dy = new int[]{0,1,0,-1};
    public static int[][] graph;
    public static int[][] visit;
    public static int villageCnt = 0;
    public static int cnt = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        visit = new int[n][n];
        for(int i = 0; i< n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(graph[i][j] == 1 && visit[i][j] == 0){
                    cnt = 1;
                    dfs(i,j);
                    list.add(cnt);
                    villageCnt++;
                }
            }
        }
        System.out.println(villageCnt);
        Collections.sort(list);
        for(int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
    public static void dfs(int r, int c){
        visit[r][c] = 1;
        for(int i = 0 ; i < dx.length; i++){
            int nr = r + dx[i];
            int nc = c + dy[i];

            if(nr<0 || nc < 0|| nr>=n || nc>=n){
                continue;
            }

            if(visit[nr][nc] == 0 && graph[nr][nc]==1){
                visit[nr][nc] = 1;
                cnt++;
                dfs(nr,nc);
            }
        }
    }
}