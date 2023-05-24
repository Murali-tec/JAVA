import java.lang.*;
import java.util.Scanner;

public class DoWhile {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Limit:");
        int n=in.nextInt();
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
    
}
