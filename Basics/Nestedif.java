import java.util.Scanner;
import java.lang.*;

public class Nestedif{
    public static void main(String args[]){
        char martial;
        Scanner in=new Scanner(System.in);
        martial=in.next().charAt(0);
        if(martial=='u' || martial=='U'){
                System.out.println("Enter your Gender:");
                char gender=in.next().charAt(0);
                System.out.println("Enter your Age:");
                int age=in.nextInt();
            if((gender =='m' ||gender=='M') && age>=30){
                System.out.println("You are Eligible for Insurance");
            }else if((gender =='f' || gender=='F')&& age>=25){
                System.out.println("You are Eligible for Insurance");

            }else{
                System.out.println("You are not ELigible for Insurance");
            }


        }else if(martial =='m' || martial=='M'){
            System.out.println("You are Eligible for Insurance");
        }else{
            System.out.println("You are not eligible for insurance");
        }

    }
}