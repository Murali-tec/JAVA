import java.util.*;


public class function_array {

    public static int[] sortArray(){
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Limit :");
        int n=in.nextInt();
         
         int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+ i +" value :");
            a[i]=in.nextInt();
        }
        Arrays.sort(a);

        return a;

    }
    public static void main(String [] args){
        int arr[]=sortArray();
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
