abstract class Mobile {
    void voicecall(){
        System.out.println("you can make voice call");
    }
    abstract void camera();
    abstract void display();
}
class Samsung extends Mobile{
    @Override
    void camera(){
        System.out.println("48 mega pixel rear camera");
    }

    @Override
    void display(){
        System.out.println("5.15 inch Display");
    }
}


class Nokia extends Mobile{
    @Override
    void camera(){
        System.out.println("24 mega pixel camera");
    }

    @Override
    void display(){
        System.out.println("Basic Display");
    }
}


public class Abstract_demo {
    public static void main(String [] args){
        Samsung s=new Samsung();
        s.voicecall();
        s.camera();
        s.display();
        System.out.println("--------------------------------");
        Nokia n=new Nokia();
        n.voicecall();
        n.camera();
        n.display();
    }
}
