import java.util.Scanner;
public class SingleDimensionArray {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=s.nextInt();
		System.out.println("Please enter the values for the array:");
		int[] a=new int [size];
		for(int j=0;j<a.length;j++)
			a[j]=s.nextInt();
		System.out.println("The values of the array");
		for(int j=0;j<a.length;j++)
			System.out.println(a[j]+"");
		int max=a[0];
		for(int j=1;j<a.length;j++)
		{
			if(max<a[j])
				max=a[j];
		}
		
		System.out.println("");
		System.out.println("the max value is:"+max);
}
}