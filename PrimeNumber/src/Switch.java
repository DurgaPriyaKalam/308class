import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		int count;
		do
		{
		System.out.println("Enter your options");
		System.out.println("1 for calculating the total");
		System.out.println("2 print wish");
		System.out.println("3 for average");
		System.out.println("4 for continue the options");
		System.out.println("5 for exit");
		count=s.nextInt();
switch(count)
{
case 1:
	System.out.println("the count value is 1");
	break;
case 2:
	System.out.println("the count value is 2");
	break;
case 3:
	System.out.println("the count value is 3");
	break;
	default:
		System.out.println("bye bye");
		break;
}

}while(count!=5); {
}
}
		}
