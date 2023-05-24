import java.util.*;

public class Arraybasics {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int total=0;
        int [] a={10,20,30,40,50};
        // for(int element:a){
        //     total+=element;
           
        // }
        // System.out.println(total);

         int largest=0;
        // for(int i=0;i<a.length;i++){
        //     for(int j=i+1;j<a.length;j++){
        //         if(a[i]>a[j]){
        //             largest=a[i];
        //         }else{
        //             largest=a[j];
        //         }
        //     }
        // }
        // System.out.println("Largest Number :"+largest);

        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                largest=a[i];
            }else{
                if(a[i]>largest){
                    largest=a[i];
                }
                
            }
        }
        System.out.println("Largest Number :"+largest);

    }
}
