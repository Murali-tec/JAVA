import java.lang.*;

class Shape{
    float length,breadth,radius;
}

class Rect extends Shape{
    Rect(float length,float breadth){
        this.length=length;
        this.breadth=breadth;
    }
    float Area(){
        return length*breadth;
    }
}

class Circle extends Shape{
    Circle(float radius){
        this.radius=radius;

    }
    float Area(){
        return (float) (3.14*radius*radius);
    }
}

class Square extends Shape{
    Square(float length){
        this.length=length;
    }
    float Area(){
        return length*length;
    }
}



public class Heirarchial {
    public static void main(String args[]){
        Rect r=new Rect(10,20);
        System.out.println("Area of the Rectangle :"+r.Area());
        
        Circle c=new Circle(7);
        System.out.println("Area of the Circle :"+c.Area());

        Square s=new Square(10);
        System.out.println("Area of Square :"+s.Area());
    }
    
}
