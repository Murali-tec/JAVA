import java.util.Scanner;

public class Ifstatement{
    public static void main(String args[]){
        int age;
        System.out.println("Enter your age:");
        Scanner in=new Scanner(System.in);
        age=in.nextInt();
        if(age>=18){
            System.out.println("You are eligibile for votee.......");
        }else{
            System.out.println("You are Not eligible for vote.........");
        }
    }
}
