package validation;
import java.util.Scanner;
public class EmailValidation {
 public void checkEmail(String email) {
	 int a=email.indexOf("@");
	 int d=email.lastIndexOf(".");
	 System.out.println(a);
	 System.out.println(d);
	 if(a>-1 && d>-1 && a<d) 
		 System.out.println("valid email id");
		 else 
			 
			 System.out.println("invalid email id"); 
	 
	 }
	 
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       EmailValidation    emailvalidation=new  EmailValidation();
        System.out.println("enter email id");
      String email=sc.next();
      emailvalidation.checkEmail(email);
       
	}

}
