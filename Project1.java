package Tarun;
import java.util.*;


interface Shape
{
    void input();
    void area();
}
class Circle implements Shape
{
    int r = 0;
    double pi = 3.14, ar = 0,per=0;
    @Override
    public void input()
    {
    		Scanner scan=new Scanner(System.in);
    		System.out.println("ENTER THE RADIUS");
    		r=scan.nextInt();
    		
        
    }
    @Override
    public void area()
    {
        ar = pi * r * r;
        System.out.println("Area of circle:"+ar);
    }
    public void perimeter() {
    	per=2*pi*r;
    	System.out.println("perimeter of circle"+per);
    	
    }
}
class Rectangle extends Circle
{
    int l = 0, b = 0;
    double ar;
    public void input()
    {
        super.input();
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the length");
        l=scan.nextInt();
        System.out.println("enter the breadth");
        b=scan.nextInt();
        
    }
    public void area()
    {
        super.area();
        ar = l * b;
        System.out.println("Area of rectangle:"+ar);
    }
    public void perimeter() {
    	super.perimeter();
    	per=2*(l+b);
    	System.out.println("perimeter of the rectangle"+per);
    }
}

public class Project1 {

	public static void main(String[] args) {
		 Rectangle obj = new Rectangle();
	        obj.input();
	        obj.area();
	        obj.perimeter();
	        
		

	}

}
