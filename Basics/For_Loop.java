import java.lang.*;
import java.util.Scanner;

public class For_Loop {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Limit:");
        int n=in.nextInt();
        for(int i=1;i<n;i++){
            System.out.println(i);
        }

    }
    
}
