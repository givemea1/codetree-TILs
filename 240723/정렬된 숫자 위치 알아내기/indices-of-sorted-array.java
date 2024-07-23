import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Pos[] origin = new Pos[n];
        Pos[] sort = new Pos[n];
        int index = 1;
        for(int i = 0 ; i < origin.length; i++){
            int value = sc.nextInt();
            origin[i] = new Pos(index, value);
            sort[i] = new Pos(index, value);
            index++;
        }
        
        Arrays.sort(sort, new Comparator<Pos>(){
            @Override
            public int compare(Pos p1 , Pos p2){
                if(p1.value != p2.value){
                    return p1.value - p2.value;
                }
                return p1.idx - p2.idx;
            }
        });

        for(int i = 0 ; i < sort.length; i++){
            for(int j = 0 ; j< origin.length; j++){
                if(origin[i].idx == sort[j].idx ){
                    System.out.print(j+1+" ");
                }
            }
        }
    }
}
class Pos{
    int idx ; 
    int value;
    Pos(int idx , int value){
        this.idx = idx;
        this.value = value;
    }
}