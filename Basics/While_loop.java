import java.lang.*;
import java.util.Scanner;
/* 
 Syntax:
 initialisation
 While(condition){
    //Statements

    Inc/Dec
 }
 */

public class While_loop {
    public static void main(String[] args){
        System.out.println("Enter the limit :");
        Scanner in=new Scanner(System.in);
        int limit=in.nextInt();
        int i=1;
        while(i<=limit){
            System.out.println(i);
            i++;
        }
    }

    
}
