class Outercls{
    void display(){
        class Inner{
            void InnerDisplay(){
                System.out.println("Inner Display");
            }
        }
        Inner i=new Inner();
        i.InnerDisplay();
    }
}

public class Local_InnerClass {
    public static void main(String [] args){
    Outercls o=new Outercls();
    o.display();
    }    
}
