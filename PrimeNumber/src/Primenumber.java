import java.util.Scanner;
public class Primenumber {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number to check prime:");
	int num=s.nextInt();
	boolean flag=true;
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			flag=false;
		    break;
	    }
	}
	if(flag==true)
		System.out.println("the number is prime");
	else
		System.out.println("the number is not prime");
}
}

