import java.util.*;
import java.io.*;

public class Main {
    public static int n,m;
    public static int[] dx = new int[]{1,0,-1,0};
    public static int[] dy = new int[]{0,1,0,-1};
    public static int[][] graph;
    public static int[][] visit;
    public static int safe;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visit = new int[n][m];
        graph = new int[n][m];

        for(int i = 0 ; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j< m ; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int k = -1;    // 안전영역의 수가 최대가 되는 k
        int max = 0;    // 안전영역 최대 수
        
        for(int i = 1; i<=100; i++){
            visit = new int[n][m];  //  방문 기록 초기화
            safe = 0;               // 매번 안전영역 개수 0 초기화
            for(int p=0; p<n; p++){
                for(int q=0; q<m; q++){
                    if(graph[p][q] > i && visit[p][q] == 0){
                        dfs(p,q,i);         
                        safe++;
                    }
                    
                }
            }
            if(safe > max){ // 만약 안전영역이 현재 최대값보다 크다면
                max = safe; // 최대값 갱신
                k=i;
            }
        }
        System.out.println(k+" "+max);
    }

    public static void dfs(int r, int c, int k){
        visit[r][c] = 1;

        for(int i =0; i<dx.length; i++){
            int nr = r+dx[i];
            int nc = c+dy[i];
            if(nr<0||nc<0||nr>=n||nc>=m){
                continue;
            }
            if(graph[nr][nc] > k && visit[nr][nc]==0){
                visit[nr][nc] = 1;
                dfs(nr,nc,k);
            }
        }
    }
}