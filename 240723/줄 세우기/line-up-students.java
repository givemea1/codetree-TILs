import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] arr = new Student[n];

        int index = 1;
        for(int i = 0 ; i < arr.length; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr[i] = new Student(index, h , w);
            index++;
        }

        Arrays.sort(arr, new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                if(s1.h != s2.h){
                    return s2.h - s1.h;
                }
                if(s1.w != s2.w){
                    return s2.w - s1.w;
                }
                return s1.index - s2.index;
            }
        });

        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i].h + " " +arr[i].w + " " +arr[i].index);
        }
    }
}

class Student{
    int index;
    int h;
    int w;
    Student(int index, int h, int w){
        this.index = index;
        this.h = h ;
        this.w = w;
    }
}