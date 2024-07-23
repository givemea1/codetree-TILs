import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] arr = new Student[n];

        for(int i = 0 ; i < arr.length; i++){
            String name = sc.next();
            int k = sc.nextInt();
            int e = sc.nextInt();
            int m  =sc.nextInt();
            arr[i] = new Student(name, k , e, m);
        }

        Arrays.sort(arr, new Comparator<Student>(){
            public int compare(Student s1 , Student s2){
                return (s1.k+s1.m+s1.e) - (s2.k+s2.m+s2.e);
            }
        });

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i].name + " " + arr[i].k + " "+ arr[i].e + " "+arr[i].m);
        }

    }
}
class Student{
    String name;
    int k;
    int e;
    int m;
    Student(String name, int k ,int e, int m){
        this.name= name;
        this.k=k;
        this.e=e;
        this.m=m;
    }
}