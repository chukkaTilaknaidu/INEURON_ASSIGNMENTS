package Tarun;
import java.util.*;
class Array{
	int size,temp;
	
	public void Sizeofarray() {
	Scanner scan =new Scanner (System.in);
	System.out.println("ENTER THE SIZE OF AN ARRAY");
	size=scan.nextInt();
	int[] array=new int[size];
	System.out.println("enter the number");
	for(int i=0;i<size;i++) {
		if(scan.hasNext()) {
		array[i]=scan.nextInt();
		}
	}
	  for (int i = 0; i < size; i++) 
      {
          for (int j = i + 1; j < size; j++) 
          {
              if (array[i] > array[j]) 
              {
                  temp = array[i];
                  array[i] = array[j];
                  array[j] = temp;
              }
          }
      }
	  System.out.println("SECOND LARGEST NUMBER IS"+ array[size-2]);
	  System.out.println("SECOND SMALLEST NUMBER IS"+ array[1]);
	
	}
	
}
public class project10 {

	public static void main(String[] args) {
		Array ar=new Array();
		ar.Sizeofarray();

	}

}
