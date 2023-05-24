class Phone{
    void voicecall(){
        System.out.println("you can make voice call");

    }
    void sms(){
        System.out.println("you can send sms");
    }
}

interface camera{
    void click();
    void record();
}

interface player{
    void play();
}

class Smartphone extends Phone implements camera,player{
    @Override
    public void click(){
        System.out.println("Took a Selfie");
    }
    @Override
   public void record(){
        System.out.println("Can Record Audio");
    }
    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("Music Player Enabled");
        
    }
}

public class Interface {
    public static void main(String args[]){
        Smartphone s=new Smartphone();
        s.click();
        s.record();
        s.play();
        s.voicecall();
        s.sms();
    }
}
