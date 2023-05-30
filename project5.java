package Tarun;


abstract class Animal{
	String name;
	public Animal(String name) {
		this.name=name;
	}
	public abstract void sound();
	public void sleep() {
		System.out.println("the animal is sleeping");
	}
}
 class Dog extends Animal{

	public Dog(String name) {
		super(name);
		
	}
	public void sound() {
		System.out.println("Dog Barks");
	}
	
}
 
 
 
 
 
 
 
 
 interface IVehcile{
	 public void start();
	public  void stop();
 }
 class CarImpl implements IVehcile{
	 public void start() {
		 System.out.println("car started");
	 }
	 public void stop() {
		 System.out.println("car stopped");
	 }
 }
 class BikeImpl implements IVehcile{
	 public void  start() {
		 System.out.println("bike started");
	 }
	 public void stop() {
		 System.out.println("bike stopped");
	 }
 }
 
 
 


public class project5 {

	public static void main(String[] args) {
		Animal Dog=new Dog("Tommy");
		Dog.sound();
		Dog.sleep();
		
		IVehcile v=new CarImpl();
		v.start();
	    v.stop();
		
	    IVehcile V=new BikeImpl();
	    V.start();
	    v.stop();
		}
		
	}


//A CLASS WHICH IS DECLARED THE ABSTRACT KEYWORD IS KNOWN AS ABSTARCT CLASS.

//AN ABSTARCT CLASS HAVE ABSTARCT AND NON ABSTARCT METHOODS(METHOODS WITH THE BODY).
 
// IN A CLASS IF ONE METHOOD IS ABSTARCTION ENTIRE CLASS IS CALLED ABSTARCT CLASS.

// ABSTARCTION IS NOTHING BUT HIDING THE IMPLEMNENTATION AND SHOWS ONLY NECCESARY PART.

// ABSTARCT KEYWORD IS ALSO USED FOR METHODS BUT NOT FOR VARIABLES.

// THERE IS TWO WAYS TO ACHIEVE ABSTARCTION.
 // 1). ABSTRACT
 //2). INTERFACE]


// INTERFACE IS A KEYWORD IS USED WHEN WE WANT 100% ABSTARCTION.

// IN INTERFACE EVERY METHOOD IS ABSTARCT AND PUBLIC.
// ONE CLASS CAN  IMPLEMENTS MORE THAN ONE INTERFACE.

// SINGLE CLASS SIMULATANEOSLY IMPLEMENTS ANDS EXTENDS AT A TIME. (EXTENDS FOLLOWED BY IMPLEMENTS).

// IN INTERFACE EVERY VARIABLE IS PUBLIC STATIC FINAL.













