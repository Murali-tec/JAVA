class Human{
    int age;
    String name;
    int Salary;
    boolean married;
    static long population;

    Human(int age,String name,int Salary,boolean married){
        this.age=age;
        this.name=name;
        this.Salary=Salary;
        this.married=married;
        Human.population+=1;
    }

   
}


class Static{  
    public void fun(){
            System.out.println("Funnnnnnnn!!!!");
        }
        static{
            System.out.println("I'm in Static class");
        }
    // public static void greeting(){
    //     System.out.println("Hello Guys!!!!");
    // }
    public static void main(String[] args){
        // greeting();
        // Human Murali=new Human(18,"Murali",100000,false);
        // Human Rahul=new Human(20,"Rahul",10000,true);

        // System.out.println(Murali.age);
        // System.out.println(Murali.name);
        // System.out.println(Murali.Salary);
        // System.out.println(Murali.married);
        // System.out.println(Human.population);

        
        
        Static s=new Static();
        s.fun();
         
        // 

        
    }
}