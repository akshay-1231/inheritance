package ICICIBank;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int ch;
          String choice;
          Scanner sc=new Scanner(System.in);
          do {
        	  System.out.println("1.Accept Details");
        	  System.out.println("2.Display Details");
        	  System.out.println("3.Withdraw Amount");
        	  System.out.println("4.Deposite Amount");
        	  System.out.println("5.Transfer Amount");
        	  System.out.println("6.Check Balance");
        	  System.out.println("7.Update Balance");
        	  System.out.println("8.Exit");
        	  System.out.println("entre choice");
        	  ch=sc.nextInt();
        	  switch(ch)
        	  {
        	  case 1 :
        		  System.out.println("accepting details");
        	    break;
        	  case 2 :
        		  System.out.println("displaying details");
        	    break; 
        	  case 3 :
        		  System.out.println("withdrawinf amount");
        	    break;
        	  case 4 :
        		  System.out.println("depositing money");
        	    break; 
        	  case 5 :
        		  System.out.println("transfrimg amount");
        	    break;
        	  case 6 :
        		  System.out.println("checking balance");
        	    break; 
        	  case 7 :
        		  System.out.println("updateing balance");
        	    break;
        	  case 8 :
        		  System.out.println("thank for visiting");
        	    break;
        	    
        	  }
        	  System.out.println("do you want to continue?(y/n)");
        	  choice=sc.next();
        	  
     
          }
          while(choice.equalsIgnoreCase("Y"));
    	  System.out.println("thank you !!!!");
          
	}

}
