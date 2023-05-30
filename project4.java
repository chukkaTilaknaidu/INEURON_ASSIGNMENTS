package Tarun;
import java.util.*;

class BankAccount {
	
	String name;
	int pin;
	int balance=1000;
	int deposit;
	int withdrawl;
	int PIN;
	String type;
	void customer() {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER THE NAME");
		name=scan.next();
		System.out.println("SET THE PASSWORD");
		pin=scan.nextInt();
		checkingprocess();
				
	}
	
	 
	void checkingprocess() {
		Scanner Scan=new Scanner(System.in);
	
		System.out.println("ENTER THE PASSWORD");
		PIN=Scan.nextInt();		
		if(pin==PIN) {
			System.out.println("enter type(deposit/withdrwal/balancechecking)");
			type=Scan.next();
			type.toLowerCase();
			
			if(type.equals("deposit")) {
				deposit();
			}
			if(type.equals("withdrawl")) {
				withdrawl();
			}
			if(type.equals("balancechecking")) {
				balancechecking();
			}
			

		}
		else {
			System.out.println("invalid pin");
			customer();
		}
		
	}


	  void deposit() {
		 Scanner scan=new Scanner(System.in);
			
			System.out.println("enter deposit value");
			
			deposit=scan.nextInt() ;
			deposit=deposit+balance;
			balance=deposit;
			
			System.out.println("total balance"+"  "+balance);
			
			System.out.println("TRANSACTION SUCCESFULLY COMPLETED");
			checkingprocess();
		
	}


	


	void withdrawl() {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("enter withdrwal money");
		withdrawl=scan.nextInt();
		
		
		 if(withdrawl<=balance) {
			 System.out.println(withdrawl+"  successfully debited from your account");
			 balance=balance-withdrawl;
			 System.out.println("total balance"+"  "+balance);
			 System.out.println("TRANSACTION SUCCESFULLY COMPLETED");
				
			}
		 else {
			  System.out.println("insufficient funds,, enter lessthan  "+balance);
			  System.out.println("your balance is  "+balance);
		 }
		checkingprocess();
	}
	 void balancechecking() {
			
			System.out.println(balance);
		}
	}

	public class project4 {

		public static void main(String[] args) {
			BankAccount ba=new BankAccount();
			ba.customer();
			
			

		}

	
}
