import java.util.*;
import java.util.Scanner;

public class Var_args {

    public static void getName(String... name){

        for(String names:name)
        System.out.println(names);
    }
    public static void main(String args[]){
        getName("Ram","Sam","Gopi","Gokul");
    }
}
