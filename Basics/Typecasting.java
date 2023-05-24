import java.lang.*;

/*
 Type Casting:
    Widening Casting
        byte -->short -->Char -->int -->long -->float -->double
    Narrow Casting
        double -->float -->long -->int -->char -->short -->byte
 */

public class Typecasting{
    public static void main(String[] args){
        // int a=10;
        // double b=a;
        // System.out.println("A:"+a);
        // System.out.println("B:"+b);
        // int c=(int)b;
        // float d=(float)b;
        // System.out.println("C:"+c);
        // System.out.println("D:"+d);
        
        //Object -->Primitive Data Type is known as Wrapper Class
        float x=Float.parseFloat(args[1]);
        float y=Float.parseFloat(args[2]);
        System.out.println(x+y);

    }
}