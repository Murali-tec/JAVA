import java.util.*;

class charClass{
    public static void main(String [] args){
        //declaring character variable
        char c;
        char c1='a';
        char c2='1';

        //Type Casting
        int i=65;
        char a=(char)i;
        System.out.println(a);

        /*
        Character Class Methods
         isLetter
         isDigit
         isLowerCase
         isUpperCase
         isWhiteSpace
         toUpperCase
         toLowerCase
         toString
         */
        System.out.println(Character.isLetter('l'));
        System.out.println(Character.isLetter('8'));

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('a'));

        System.out.println(Character.isLowerCase('i'));
        System.out.println(Character.isLowerCase('I'));
        System.out.println(Character.isUpperCase('I'));
        System.out.println(Character.isUpperCase('i'));

        // System.out.println(Character.isWhitespace("\n"));
        // System.out.println(Character.isWhitespace(""));

        char x='a';
        System.out.println(Character.toString(x));
   
        
    }

   
}