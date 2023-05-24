class Calculator{
    public void add(){
       int  a=10;
        int b=15;
        System.out.println("Addition :"+(a+b));
    }

    public int sub(int x,int y){
        return x-y;

    }
    public void mul(int x,int y){
        System.out.println("Multiplication :"+x*y);
    }

    public float div(int x,int y){
        return x/y;
    }
}

public class Method {
    public static void main(String[] args){
        Calculator c=new Calculator();
        c.add();
        System.out.println("Subtraction :"+c.sub(25,7));
        c.mul(25,3);
        System.out.println("Division :"+c.div(10,3));
    }    
}
