import java.util.Scanner;
public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float celsius;
System.out.println("Enter the Celsius:");
Scanner sc=new Scanner(System.in);
celsius=sc.nextFloat();
if(celsius!=0)
{
	float f=((9/5)*celsius)+32;
	System.out.println("Fahrenheit is:" + f);
}

	}

}
