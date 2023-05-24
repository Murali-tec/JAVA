class Rectangle{
    int length,width;

    void getDetails(int x,int y){
        length=x;
        width=y;
    }

    int Area(){
        int a=length*width;
        return a;
    }
}

public class Object{
    public static final String b = null;

    public static void main(String args[]){
        Rectangle r=new Rectangle();
        //r.getDetails(5, 6);
        r.length=20;
        r.width=30;
        //r.Area();
        System.out.println("Area of the Rectangle :"+r.Area());

    }
}