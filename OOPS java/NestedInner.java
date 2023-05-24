  class Outer{
   public static int a=25;

    class Inner{
       public static int b=50;


       void InnerDisplay(){
            System.out.println("A :"+a);
            System.out.println("B :"+b);
        }
    }

    void Outerdisplay(){
        Inner i=new Inner();
        i.InnerDisplay();
        System.out.println("Inner Class Value :"+i.b);
    }
}



public class NestedInner {
    public static void main(String [] args){
       
        Outer o=new Outer();
        o.Outerdisplay();
       
    }
}
