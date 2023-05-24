import java.lang.*;
import java.util.Scanner;

public class StringConcept {
    public static void main(String args[]){
        //String in java
        String a="Murali";
        String b="murali";
        System.out.println("A :"+a);
        System.out.println("B :"+b);
        System.out.println("A Hashcode :"+a.hashCode());
        System.out.println("B Hashcode :"+b.hashCode());
        System.out.println("Equals :"+a.equals(b));
        System.out.println("CharAt :"+a.charAt(2));
        System.out.println("UpperCase :"+a.toUpperCase());
        System.out.println("LowerCase :"+a.toLowerCase());
        System.out.println("Replace :"+a.replace("Murali","Prasath"));
        System.out.println("A :"+a);
        System.out.println("Contains :"+a.contains("Prasath"));
        System.out.println("Empty :"+a.isEmpty());
        System.out.println("StartsWith :"+a.startsWith("Mu"));
        System.out.println("EndsWith :"+a.endsWith("ali"));
        System.out.println("Length :"+a.length());
        System.out.println("SubString :"+a.substring(0,3));

        char[] c_array=a.toCharArray();
        for(char s:c_array){
            System.out.print(s+" ");
        }
        System.out.println("\n");
        String c="     Hello        ";
        System.out.println("Trim :"+c.trim());
    }
}
