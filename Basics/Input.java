import java.util.Scanner;

/*
sc.nextInt()
sc.nextFloat()
sc.nextDouble()
sc.nextInt()
sc.nextLine()
 */

public class Input{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 2Nos:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=(a*a)+(b*b)+(2*a*b);
        System.out.println("Result:"+c);

        
    }
}