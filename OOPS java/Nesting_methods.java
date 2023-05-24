import java.lang.*;
class Demo{
    int m,n;
    Demo(int n,int m){
        this.n=n;
        this.m=m;
     }

     int largest(){
        if(m>n){
            return m;
        }else{
            return n;
        }
     }

     void display(){
        int large=largest();
        System.out.println("Largest Number is :"+large);
     }
}
public class Nesting_methods {
    public static void main(String args[]){
        Demo d=new Demo(5,10);
        d.display();
    }
    
}
