import java.lang.*;
import java.util.*;

public class Insert_Array {
    public static void main(String args[]){
        int a[]={10,20,30,40,50,60,70,80,90,100};
        System.out.println("Before Insert :"+Arrays.toString(a));
        int index=3;
        int value=55;

        for(int i=a.length-1;i>index;i--){
            a[i]=a[i-1];
        }

        a[index]=value;
        System.out.println("After Insert :"+Arrays.toString(a));
    }
}
