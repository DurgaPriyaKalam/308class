package fibonocci;

public class fib {

	public static void main(String[] args) {
	int sum=2;
	   int firstnumber=0;
	   int secondnumber=2;
	   System.out.println(firstnumber + " , ");
	   System.out.println(secondnumber + " , ");
	   for(int i=0;i<=6;i++)
	   {
		   int nextnum=firstnumber+secondnumber;
		   System.out.println(nextnum+" , ");
		   firstnumber=secondnumber;
		   secondnumber=nextnum;
		   sum=sum+nextnum;
	   }
	   System.out.print("\nTotal sum of the numbers are:" +sum);	
}
}