abstract class testDemo{
    abstract void Innerdisplay();
}

class Demo{

    public void outerDisplay(){
        testDemo td=new testDemo(){
            @Override
            void Innerdisplay(){
                System.out.println("Test Display");
            }
        };
        td.Innerdisplay();
    }
}


public class Anonymous_Class{
    public static void main(String [] args){
        Demo d=new Demo();
        d.outerDisplay();
    }
}
