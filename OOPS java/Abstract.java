abstract class Shape{
    abstract void draw();
    void message(){
        System.out.println("This is a Abstract class");
    }
    
}

class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Rectangle");
    }
}


class Abstract{
    public static void main(String [] args){
        Rectangle r=new Rectangle();
        r.draw();
        r.message();
    }
}