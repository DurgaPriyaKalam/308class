package fibonocci;
import java.util.Scanner;
public class Digits {
	public boolean allDigitsOdd(int num)
	{
		boolean result=true;
		int i,j=0,k=0;
		
			while(num<0)
			{
				i=num%10;
				if(i%2==0)
				{
					j++;
				}
				else
					k++;
				
			}
			if(j==0 && k>0)
			{
	           result=true;
	          
			}
			else if(j>0)
			{
				result=false;
				
			}
			
			return result;
		}
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner sc=new Scanner(System.in);
  int num=sc.nextInt();
  Digits obj1=new Digits();
  boolean result=obj1.allDigitsOdd(num);
  System.out.println(result);
}
}