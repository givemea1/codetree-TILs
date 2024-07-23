import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Pos[] arr = new Pos[n];
        int idx = 1;
        for(int i = 0 ;i<arr.length;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i] = new Pos(idx, x,y);
            idx++;
        }

        Arrays.sort(arr, new Comparator<Pos>(){
            @Override
            public int compare(Pos p1, Pos p2){
                if(p1.calc() != p2.calc()){
                    return p1.calc() - p2.calc();
                }
                return p1.idx - p2.idx;
                
            }
        });

        for(int i = 0 ; i <arr.length; i++){
            System.out.println(arr[i].idx);
        }
    }
}

class Pos{
    int idx;
    int x;
    int y ;
    Pos(int idx, int x, int y){
        this.idx = idx;
        this.x=x;
        this.y = y;
    }

    public int calc(){
        return Math.abs(this.x-0) + Math.abs(this.y-0);
    }
}