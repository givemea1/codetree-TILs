import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;

        Student[] arr= new Student[n];

        for(int i = 0 ; i < arr.length; i++){
            String s = sc.next();
            int h = sc.nextInt();
            double w = sc.nextDouble();
            arr[i] = new Student(s, h, w);
        }

        System.out.println("name");

        Arrays.sort(arr, new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                return s1.s.compareTo(s2.s);
            }
        });

        for(int i = 0 ; i < arr.length ; i ++){
            System.out.println(arr[i].s+" " +arr[i].h+" " +arr[i].w);
        }
        
        System.out.println();
        System.out.println("height");

        Arrays.sort(arr, new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                return s2.h-s1.h;
            }
        });

        for(int i = 0 ; i < arr.length ; i ++){
            System.out.println(arr[i].s+" " +arr[i].h+" " +arr[i].w);
        }
    }
}

class Student{
    String s; 
    int h ;
    double w;

    Student(String s, int h ,double w){
        this.s = s;
        this.h = h;
        this.w = w;
    }
}