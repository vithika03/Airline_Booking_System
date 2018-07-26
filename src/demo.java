
import java.util.Scanner;
public class demo {
     public static void main(String args[])
        {
            airline a1 = new airline ();
            System.out.println("\t\t\t\t\t\tWelcome to indiana airlines");
            a1.value();
            int choice;
            Scanner c1= new Scanner(System.in);
            while(true)
            { 
                System.out.println("Enter which class to travel in \n\t1.Economy \n\t2.Business\n\t3. Exit");
                choice = c1.nextInt();
                if(choice==1){
                    System.out.println("****************WELCOME TO ECONOMY CLASS****************");
                    economy e1=new economy();
                    e1.fare();
                    e1.book();
                    
                }
                else if(choice==2){
                    System.out.println("****************WELCOME TO BUSINESS CLASS****************");
                    business b1=new business();
                    b1.fare();
                    b1.book();
                }
                else {
                	System.out.println("Booking complete");
                    break;
                }
            
            }
            
        }
        

}

