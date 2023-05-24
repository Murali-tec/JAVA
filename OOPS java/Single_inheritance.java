import java.lang.*;

class Father{
    public void house(){
        System.out.println("Owned 2BHK House");
    }
}

class Son extends Father{
    public void car(){
        System.out.println("Owns a Car");
    }
}
public class Single_inheritance {
    public static void main(String args[]){
        Son s=new Son();
        s.house();
        s.car();
    }
}
