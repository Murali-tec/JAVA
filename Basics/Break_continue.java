import java.lang.*;

public class Break_continue {
    public static void main(String args[]){
        for(int i=0;i<=10;i++){
            if(i==5){
                continue;
            }
            if(i==8){
                break;
            }
            System.out.println(i);
        }
    }
    
}
