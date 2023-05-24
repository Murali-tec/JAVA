import java.lang.*;
import java.util.Scanner;

public class Array{
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,9,10};

        // for(int i=0;i<a.length;i++){
        //     System.out.println(i);
        // }

        // for(int n:a){
        //     System.out.println(n);
        // }

        int b[];
        b=new int[10];

        int [] c=new int[10];

        for(int i=0;i<10;i++){
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the Number :");
            c[i]=in.nextInt();
        }

        for(int element:c){
            System.out.println(element);
        }
    }
}
