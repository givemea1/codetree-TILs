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
            int m = sc.nextInt();

            arr[i] = new Student(name,k,e,m);
        }
        Arrays.sort(arr, new Comparator<Student>(){
            @Override
            public int compare(Student s1 , Student s2){
                if(s1.k != s2.k){
                    return s2.k-s1.k;
                }
                if(s1.e != s2.e){
                    return s2.e-s1.e;
                }
                    return s2.m-s1.m;
            }
        });

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i].n+" " +arr[i].k+" " +arr[i].e+" "+arr[i].m);
        }
    }
}

class Student{
    String n;
    int k;
    int e;
    int m;
    Student(String n , int k, int e, int m){
        this.n = n;
        this.k = k;
        this.e = e;
        this.m =m;
    }
}