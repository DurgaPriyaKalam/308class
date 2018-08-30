import java.util.Scanner;
public class MultiplesOfThree {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int c = 0; c <= 1000; c++)
		{
	         if (c% 3 ==0)
	          {   
	           System.out.println(c);
	          }
		
	         else if(c%2==0 && c%5==0)
			{
				 System.out.println("Bubble");
			}
			else if(c%2==0)
			{
				System.out.println("Meow");
			}
			else if(c%5==0)
			{
				System.out.println("Wouf");
			}
			else
			{
				System.out.println(c);
			}
	         }
	}
}

	




