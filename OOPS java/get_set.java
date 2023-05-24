
import java.lang.*;

//Data hiding getters and setters
class ShapeRectangle{
   private int x,y;
   
   void setWidth(int width){
        x=width;
    }

void setLength(int length){
        y=length;
    }

   int getLength(){
        return x;
    }

    int getWidth(){
        return y;
    }

   
    void Area(){
        int z=x*y;
        System.out.println("Area :"+z);
    }
}

class Main{
    public static void main(String args[]){
        ShapeRectangle sr=new ShapeRectangle();
        sr.setLength(2);
        sr.setWidth(3);
        System.out.println(sr.getLength());
        System.out.println(sr.getWidth());

        sr.Area();

    }
}