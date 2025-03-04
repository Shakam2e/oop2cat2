/*write a java program that would implement the classes named teacher and person
*. The program should then accept the; _name,_age,basic_alary,house_allowance
*,rate_of_taxation and calculate the net_salary through the Computer_netSal().
*The program should then output the netsal().
*Hint: basic_salary*rate_of_taxation.
*/
import java.util.Scanner;
public  class Salary {
    //instance variables
    String name;
      
        int age;
        
    int salary,allowance,tax;
    Scanner meshack=new Scanner(System.in);
    
    //teacher class
    public class teacher extends Salary{
        //basic salary method
    int basic_salary(){
      
       
       System.out.println("enter your basic salary");
       salary=meshack.nextInt();
       
       return salary;
    }
    int house_allowance(){
       
       System.out.println("enter your allowance");
       allowance=meshack.nextInt();
       return allowance;
    }
     int rate_of_taxation(){
       
        tax=(int) (salary*0.18);
     
        return tax;
    }
  
    
     int Compute_netSal(){
    int net_salary;
    net_salary=salary-(allowance+tax);
    System.out.println("your net_salary ="+net_salary);
    return net_salary;
    }
  }
  public static class person extends teacher{
       
        void Display(){
        System.out.println("enter your name");
       name=meshack.nextLine();
       System.out.println("enter your age");
       age=meshack.nextInt();
      
        }
  
  }
    
    

    public static void main(String[] args) {
       
       person output=new person();
       output.Display();
       output.basic_salary();
       output.house_allowance();
       output.rate_of_taxation();
       output.Compute_netSal();
    }
    
}
