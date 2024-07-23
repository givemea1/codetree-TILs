import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] arr = new Student[n];

        for(int i = 0 ; i < arr.length; i++){
            String s = sc.next();
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr[i] = new Student(s, h , w);
        }


        Arrays.sort(arr, new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                if(s2.h != s1.h){
                    return s1.h - s2.h;
                }
                return s2.w - s1.w;
                
            }
        });

        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i].s + " " + arr[i].h+" " +arr[i].w);
        }
    }
}

class Student{
    String s;
    int h;
    int w ;

    public Student(String s, int h , int w){
        this.s = s;
        this.h = h;
        this.w = w;
    }
}