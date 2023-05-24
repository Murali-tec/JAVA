import java.lang.*;


class Student{
    String name;
    int rollNo;

    Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;

    }
    void print(){
        System.out.println("Name :"+name);
        System.out.println("RollNo :"+rollNo);
        System.out.println("---------------------------");
    }
}


public class Array_objects {
    public static void main(String args[]){
       Student[] arr;
       arr=new Student[4];
        arr[0]=new Student("Murali",15);
        arr[1]=new Student("Ram",25);
        arr[2]=new Student("Sam",35);
        arr[3]=new Student("Goppi",46);

        for(int i=0;i<arr.length;i++){
            arr[i].print();
        }
    }
    
}
