


import java.util.*;
public class airline {

    int flightno;
    String source , destination;
    
    airline()
    {
        flightno=456;
        source="India";
        destination="America";
    }
    
    airline(int x,String y,String z)
    {
        flightno=x;
        source=y;
        destination=z;
    }
    
    void   value()
    {
        System.out.println("Enter the following details \n\tflight no: \n\tsource: \n\tdestination:");
        Scanner sc=new Scanner(System.in);
        flightno=sc.nextInt();
        source=sc.next();
        destination=sc.next();
        System.out.println("\t\tYou are travelling in Flight no-"+flightno+" from "+source+" to "+destination);
        
    }

   
    
}

class economy extends airline
{
    static int booked;
    int seatno;
    int new_booked;
    int base_price=2000;
    int noofseats;
    Scanner s1=new Scanner(System.in);
   static int seats[] = new int[100];
    economy()
    {
        
        super();
        seatno=0;
        
    }
    
    economy(int x,String y,String z,int p)
    {
        super(x,y,z);
        seatno=p;
    }
    
    void fare(){
        System.out.println("\tEnter no of seats to get a price estimate:");
        noofseats= s1.nextInt();
        double fare= ((20*base_price)/100)+base_price;
        double cal = (5*fare)/100;
        double tfare = (fare + cal)*noofseats;
        System.out.println("Your Total fare would be :"+tfare);
        }
    
    void book()
    {
        int ch1;
        int ch;
        
        for(int i=0;i<seats.length;i++)
        {
            seats[i]=0;
        }
      
    
       
        System.out.println("Enter the no of seats you want to book");
       
        booked=s1.nextInt();
        for(int j=0;j<booked;j++)
        {
            seats[j]=1;
        }
        System.out.println("You have booked "+booked+" seats");
        System.out.println("The number of seats left:"+(100-booked));
       
       
        System.out.println("Do you want to book more(1/0)??");
        ch=s1.nextInt();
            
        while(ch!=0)
        {    
        System.out.println("How many more seats you want to book");
        new_booked=s1.nextInt();
        booked = booked + new_booked;
        for(int j=0;j<booked;j++)
        {
            seats[j]=1;
        }
        System.out.println("The number of seats left:"+(100-booked));

        System.out.println("Do you want to book more(1/0)??");
        ch=s1.nextInt();
        
        }
      
       
        
        System.out.println("Do you want to cancel the seats(1/0)??");
        ch1=s1.nextInt();
        if(ch1!=0)
        {
            cancel(booked);
        }
        
        
        }
    
    void cancel(int x)
    {
        System.out.println("Enter the no of seats you want to cancel");
        int cancel=s1.nextInt();
        for(int i=0;i<cancel;i++)
        {
        seats[i]=0;    
        }
        System.out.println("The no of seats left booked are:"+(booked-cancel));
        System.out.println("The number of seats left:"+(100-x+cancel));
    }
    
    }
class business extends airline
{
    
    
    static int booked;
    int seatno;
    int new_booked;
    int base_price=2000;
    int noofseats;
    Scanner s1=new Scanner(System.in);
   static int seats[] = new int[100];
   
       
    business()
    {
        
        super();
        seatno=0;
        
    }
    
    business(int x,String y,String z,int p)
    {
        super(x,y,z);
        seatno=p;
    }
    
    void fare(){
        System.out.println("enter no of seats");
        noofseats= s1.nextInt();
        double fare= ((30*base_price)/100)+base_price;
        double cal = (20*fare)/100;
        double fare2 = (fare + cal);
        double tax= (10*fare2)/100;
        double tfare= (fare2 +tax)*noofseats;
        System.out.println("total fare is:"+tfare);
        }
    
    
    void book()
    {
        int ch1;
        int ch;
        
        for(int i=0;i<seats.length;i++)
        {
            seats[i]=0;
        }
      
    
       
        System.out.println("Enter the no of seats you want to book");
       
        booked=s1.nextInt();
        for(int j=0;j<booked;j++)
        {
            seats[j]=1;
        }
        System.out.println("The number of seats left:"+(100-booked));
       
       
        System.out.println("Do you want to book more(1/0)??");
        ch=s1.nextInt();
            
        while(ch!=0)
        {    
        System.out.println("How many more seats you want to book");
        new_booked=s1.nextInt();
        booked = booked + new_booked;
        for(int j=0;j<booked;j++)
        {
            seats[j]=1;
        }
        System.out.println("The number of seats left:"+(100-booked));

        System.out.println("Do you want to book more(1/0)??");
        ch=s1.nextInt();
        
        
        }
       
        
        System.out.println("Do you want to cancel the seats(1/0)??");
        ch1=s1.nextInt();
        if(ch1!=0)
        {
            cancel(booked);
        }
        
        
        }
    
    void cancel(int x)
    {
        System.out.println("Enter the no of seats you want to cancel");
        int cancel=s1.nextInt();
        for(int i=0;i<cancel;i++)
        {
        seats[i]=0;    
        }
        System.out.println("The no of seats left booked are:"+(booked-cancel));
        System.out.println("The number of seats left:"+(100-x+cancel));
    }
}



