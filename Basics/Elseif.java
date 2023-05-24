import java.util.Scanner;
import java.lang.*;

public class Elseif{
    public static void main(String args[]){
        int grade;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your Grade:");
        grade=in.nextInt();
        if(grade>80){
            System.out.println("O Grade");
        }else if(grade>70 && grade<80){
            System.out.println("A Grade");
        }else{
            System.out.println("B Grade");

        }
    }
    
}
