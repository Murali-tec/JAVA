import java.lang.*;
import java.util.*;

public class StringBufferandBuilder {
    public static void main(String[] args){
        // StringBuffer and Builder
        StringBuffer buffer=new StringBuffer("Murali");
        System.out.println(buffer);
        buffer.append(" Prasath");
        System.out.println(buffer);
        buffer.insert(14,"   Web Dev");
        System.out.println(buffer);
        // buffer.replace(15, 17,"@");
        // System.out.println(buffer);
        buffer.reverse();
        System.out.println(buffer);
        System.out.println("Length :" +buffer.length());


    }
}
