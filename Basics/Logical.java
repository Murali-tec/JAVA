/*
 Logical Operators
 && 	Logical and	Returns true if both statements are true	                    x < 5 &&  x < 10	
|| 	    Logical or	Returns true if one of the statements is true	                x < 5 || x < 4	
!	    Logical not	Reverse the result, returns false if the result is true	        !(x < 5 && x < 10)	
*/
import java.lang.*;

public class Logical{
    public static void main(String[] args){
        int x=5;
        System.out.println( x>3 && x<10);
        System.out.println( x>3 || x<10);
        System.out.println( !(x>3 || x<10));
    }
}
