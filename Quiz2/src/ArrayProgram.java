import java.lang.reflect.Array;
import java.util.Scanner;
public class ArrayProgram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ;
	     int size;
	    
	     System.out.println("Enter size of array");
	     Scanner obj = new Scanner(System.in);
	     size=obj.nextInt();
	     a=new int[size];
	     System.out.println("Enter the values of array");
	     for(int i=0;i<a.length;i++)
	     {
	        Scanner obj1 = new Scanner(System.in);
	         a[i]=obj1.nextInt();
	     }
	     System.out.println("Enter the number to find in array");
	     Scanner obj2 = new Scanner(System.in);
	     int number=obj2.nextInt();
	     int k=0;
	     for (int i=0;i<a.length;i++)
	     {
	    if(a[i]==number) 
	    {
	    System.out.println(number + "found at location " + i);
	    k=1;
	        }
	    
	     }
	     if(k==0)
	     {
	    System.out.println(number + " not found");
	     }
	 
	}
	
}
