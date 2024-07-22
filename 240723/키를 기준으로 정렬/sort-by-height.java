import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] arr = new Student[n];

        for(int i = 0; i < n ; i++){
            String name = sc.next();
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr[i] = new Student(name, h , w);
        }

        Arrays.sort(arr, new Comparator<Student>(){
            @Override
            public int compare(Student a, Student b){
                return a.h - b.h;
            }
        });

        for(int i = 0 ; i < n; i++){
            System.out.println(arr[i].name+" "+arr[i].h+" " +arr[i].w);
        }

        
    }
}

class Student{
    String name ;
    int h;
    int w;
    Student(String name, int h, int w){
        this.name = name;
        this.h = h;
        this.w = w;
    }
}