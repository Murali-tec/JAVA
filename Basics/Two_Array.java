import java.lang.*;
import java.util.*;

public class Two_Array {
    public static void main(String args[]){
        int a[][]={
            {10,20,30},
            {40,50,60},
            {70,80,90}
    
    };

   

    int b[][]=new int[3][3];

    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            Scanner in=new Scanner(System.in);
            b[i][j]=in.nextInt();
        }
    }
    
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(" "+b[i][j]);
        }
        System.out.println(" ");
    }
        
    }
}
