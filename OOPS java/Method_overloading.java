import java.lang.*;
import java.util.Scanner;

class mathOperation{
    public static int Multiply(int a,int b){
        return a*b;
    }
    public static double Multiply(double a,double b){
        return a*b;
    }
    public static int Multiply(int r){
        return r;
    }
}


public class Method_overloading {
   
    public static void main(String args[]){
        System.out.println("Answer :"+mathOperation.Multiply(10, 5));
        System.out.println("Answer :"+mathOperation.Multiply(10.5,2.5));
        System.out.println("Answer :"+mathOperation.Multiply(5));


    }
}
