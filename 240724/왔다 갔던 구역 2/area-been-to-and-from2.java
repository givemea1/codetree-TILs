import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] map = new int[1000*2+1];

        int idx = map.length /2 ;

        for(int i=0; i<n; i++){
            int cnt = sc.nextInt();
            String dir = sc.next();
        
            if(dir.equals("R")){
                for(int j = 0; j < cnt; j++){
                    map[idx]++;
                    idx++;
                }
            }else{
                for(int j = 0; j < cnt; j++){
                    map[--idx]++;
                }
            }
        }

        int sum = 0;
        for(int i = 0; i<map.length;i++){
            if(map[i] > 1){
                sum++;
            }
        }
        System.out.println(sum);
    }

}