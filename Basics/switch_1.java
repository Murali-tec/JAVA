import java.util.*;

class Switch_1{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        // String fruit=in.nextLine();

        // int day=in.nextInt();

        // switch(fruit){
        //     case "Apple":
        //         System.out.println("The red sweet fruit");
        //         break;
        //     case "Orange":
        //         System.out.println("The round fruit");
        //         break;
        //     case "Mango":
        //         System.out.println("The yellow fruit");
        //         break;
        //     default:
        //         System.out.println("please enter the valid fruit");




            // switch(day){
            //     case 1 -> System.out.println("Monday");
            //     case 2 ->System.out.println("tuesday");
            //     case 3 ->System.out.println("Wednesday");
            //     case 4 ->System.out.println("Thursday");
            //     case 5 ->System.out.println("Friday");
            //     case 6 ->System.out.println("Saturday");
            //     case 7 ->System.out.println("Sunday");
            //     default ->System.out.println("Enter the valid day");
            // }
            

            int empId=in.nextInt();
            String department=in.next();

            switch (empId){
                case 1:
                    System.out.println("Murali");
                    break;
                case 2:
                    System.out.println("Manu");
                    break;
                case 3:
                    switch(department){
                        case "IT":
                            System.out.println("IT Department");
                            break;
                        case "CSE":
                            System.out.println("CSE Department");
                            break;
                        default:
                            System.out.println("Enter the valid department");
                    }
                    break;
                default:
                System.out.println("Enter the valid choice");
            }
        }
    }
