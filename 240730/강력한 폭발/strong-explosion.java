import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int[][] graph;
    public static int[][] visit;
    public static ArrayList<Integer> list = new ArrayList();
    public static Map<Integer,int[]> boom = new HashMap<>();
    public static int count = 0;
    public static int max = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        graph = new int[n][n];
        visit = new int[n][n];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n; j++){
                int num = Integer.parseInt(st.nextToken());
                if(num > 0){
                    boom.put(boom.size()+1,new int[]{i,j});
                }
                graph[i][j] = num;
            }
        }
        recursive(0);
        System.out.println(max+boom.size());
    }
    public static void paint(int idx, int p){
        int r = boom.get(idx)[0];
        int c = boom.get(idx)[1];
        int[] dx ;
        int[] dy ;
        if(p == 1){
            dx = new int[] {1,2,-1,-2};
            dy = new int[] {0,0,0,0};
        }else if (p == 2){
            dx = new int[] {1,0,-1,0};
            dy = new int[] {0,1,0,-1};
        }else{
            dx = new int[] {1,1,-1,-1};
            dy = new int[] {1,-1,1,-1};
        }

        for(int i = 0 ; i < dx.length; i++){
            int nr = r + dx[i];
            int nc = c + dy[i];

            if(nr<0|| nc<0||nr>=n||nc>=n){
                continue;
            }
            if(graph[nr][nc] == 0 && visit[nr][nc] == 0){
                visit[nr][nc] = 1;
                count++;
            }
        }
    }

    public static void recursive(int num){
        if(num == boom.size()){
            count = 0;
            visit = new int[n][n];
            for(int i = 0 ; i<list.size(); i++){
                paint(i+1, list.get(i));
            }
            if(max < count){
                max = count;
            }
            return;
        }

        for(int i = 1; i<=3; i++){
            list.add(i);
            recursive(num+1);
            list.remove(list.size()-1);
        }
    }
}