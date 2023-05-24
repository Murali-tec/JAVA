import java.lang.*;
import java.util.Scanner;

public class Even_odd {
    public static void main(String args[]){
        int e=0;
        int o=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Limit :");
        int n=in.nextInt();
        int [] a=new int [n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the Number :");
            a[i]=in.nextInt();
        }

        for(int element:a){
            if(element%2==0){
                e++;
            }else{
                o++;
            }
        }
        System.out.println("Even Count :"+e);
        System.out.println("Odd Count :"+o);
    }
}
