class Maths{
    public static int power(int base,int power){
        
        int result=1;
        for(int i=0;i<power;i++){
            result*=base;
        }
        return result;
    }
}


public class Static_function {
    public static void main(String [] args){
        System.out.println("Result :"+Maths.power(2,3));
    }

    
}
