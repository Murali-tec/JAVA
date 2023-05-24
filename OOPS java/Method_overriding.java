import java.lang.*;
import java.util.*;


class User{
    String name;
    int age;

    User(String name,int age){
        this.name=name;
        this.age=age;

    }
    public void display(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }
}

class mainProgrammer extends User{
    String CompanyName;
    mainProgrammer(String name,int age,String CompanyName){
        super(name,age);
        this.CompanyName=CompanyName;
    }
    public void display(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Company :"+CompanyName);
    }
}
public class Method_overriding {
    public static void main(String args[]){
        mainProgrammer p=new mainProgrammer("Ram",20,"Hcl Technologies");
        p.display();
    }
    
}
