import java.lang.*;

public class Student{
    int rollNo=61;

    public void display(){
        System.out.println("Roll No:"+rollNo);
    }

    public static void main(String args[]){
        Student sd=new Student();
        sd.display();

    }
}