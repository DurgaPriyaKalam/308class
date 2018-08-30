import java.util.Scanner;
public class DivisibleProgram {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum=0,sum1=0,sum2=0;
		System.out.println("\nDivided by 3: ");		
		for (int i=0; i<500; i++) {
			if (i%3==0) 
			{
			System.out.print(i +", ");	
			sum=sum+i;
			}
			
		}			
		System.out.print("\nTotal sum of the numbers are:" +sum);			
		System.out.println("\n\nDivided by 5: ");
		for (int i=0; i<500; i++) {
			if (i%5==0) 
			{
			System.out.print(i +", ");		
			sum1=sum1+i;
			}
				
		}
		System.out.print("\nTotal sum of the numbers are:" +sum1);	
		System.out.println("\n\nDivided by 7: ");			
		for (int i=0; i<500; i++) {
			if (i%7==0)
			{
			System.out.print(i +", ");	
			sum2=sum2+i;
			}
		
		}
		System.out.print("\nTotal sum of the numbers are:" +sum2);	
		System.out.println("\n");
	}

}
