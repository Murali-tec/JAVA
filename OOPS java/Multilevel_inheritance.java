class GrandFather{
    public void Land(){
        System.out.println("Owns 2 Acres of Land");
    }
}

class father extends GrandFather{
    public void house(){
        System.out.println("Owns 2BHK house ");
    }
}

class Son extends father{
    public void car(){
        System.out.println("Owns a Ferrari Car");
    }
}


public class Multilevel_inheritance {
    public static void main(String args[]){
        Son o=new Son();
        o.Land();
        o.house();
        o.car();
    }
}
