//Nested Class
class Outer{ 
    int a=10;

    class Inner{
        int b=15;

        void innerDisplay(){
            System.out.println("A :"+a);
            System.out.println("B :"+b);
        }
    }

    void outerDisplay(){
        Inner i=new Inner();
        i.innerDisplay();
        System.out.println("B :"+i.b);
    }
}

public class Nested_InnerClass {
    public static void main(String args[]){
        Outer o=new Outer();
        o.outerDisplay();
        Outer.Inner i=new Outer.new Inner();
        i.innerDisplay();
    }
}
