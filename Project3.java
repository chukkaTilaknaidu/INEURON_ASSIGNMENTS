package Tarun;
import java.util.*;

class ExceptionHandling{
	
	 void checking() {
		
			int a;
		
     Scanner scan= new Scanner(System.in);
     System.out.println("enter the number");
     a=scan.nextInt();
     try {
     if(a<0)  {
    	 throw new Exception(a+ "   Number is negative");
     	 
     }
     else {
    	 System.out.println(a);
     }
     }
     catch (Exception e) {
    	 System.out.println(e);
     }
     
		}
	 }


public class Project3 {

	public static void main(String[] args) {
		ExceptionHandling eh=new ExceptionHandling();
		eh.checking();
		

	}

}
