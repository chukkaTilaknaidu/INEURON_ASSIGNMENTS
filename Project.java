package Tarun;

class ParentProject{
	   ParentProject () {                                                     //PARENT CLASS CONSTRUCTOR
		System.out.println(" THIS IS A PARENT CLASSS CONSTRUCTOR");	
	}
}
class ChildProject extends ParentProject{
	
	 ChildProject(){	   //CHILD CLASS CONSTRUCTOR
	 }
}
public class Project {
	public static void main(String[] args) {
		ChildProject cp=new ChildProject();	     // CREATING AN OBJECT FOR CHILD CLASS
	}
}
   // -------------------------------------KEY POINTS ABOUT CONSTRUCTOR----------------------------------------------------------------------------

//  1)...  WHEN CLASS NAME AND METHOOD NAME ARE SAME , THEN WE CALL THAT METHOOD AS CONSTRUCTOR.
//  2)...  CONSTRUCTORS ARE AUTOMATICALLY INVOKE WHEN YOU CREATE OBJECT FOR THAT CLASS.
//  3)...  EVERY CONSTRUCTOR BY-DEFAULT THE FIRST LINE IS SUPER() METHOOD , WHICH CALLS PARENT CLASS CONSTRUCTOR..
//  4)...  EVERY CONSTRUCTOR IS BY DEFAULT ZERO PARAMETERISED.
//  5)...  CONSTRUCTORS DOESNT HAVE RETURN TYPE.
//  6)...  CONSTRUCTORS ARE USED TO CRETATE INSTANCE OF THE CLASS.
