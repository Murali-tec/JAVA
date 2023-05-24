package Package.Java;

public class Access {
    protected int num;
    private String name;
    private int age;

    public Access(int a,String name,int age){
        this.num=a;
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(){
        this.age=age;
    }
}
