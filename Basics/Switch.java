import java.lang.*;
import java.util.Scanner;

public class Switch{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int ch;
        System.out.println("Enter your Choice:");
        ch=in.nextInt();
        switch(ch){
            case 1:
                System.out.println("Bike");
                break;
            case 2:
                System.out.println("Cars");
                break;
            case 3:
                System.out.println("Train");
                break;

            case 4:
                System.out.println("Ships");
                break;
            default:
                System.out.println("Invalid Choice");
            
        }
    }

}
