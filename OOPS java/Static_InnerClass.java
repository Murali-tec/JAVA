class OuterClass{
    static int x=10;
    int y=20;

    static class Inner{
        void display(){
            System.out.println("X :"+x);
        }
    }
}




 public class Static_InnerClass {
    public static void main(String[] args){
        OuterClass.Inner x=new OuterClass.Inner();
        x.display();
    }
}
