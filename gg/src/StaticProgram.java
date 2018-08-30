import java.util.Scanner;
public class StaticProgram {
static int cube(int x) {
	return x*x*x;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.print("Enter the number:");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	System.out.print(cube(x));
	}
}
