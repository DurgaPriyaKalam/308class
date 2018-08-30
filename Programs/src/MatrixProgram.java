import java.util.Scanner;
public class MatrixProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of rows and columns of matrix");
    int m=sc.nextInt();
    int n=sc.nextInt();
    int first[][]=new int[m][n];
    int second[][]=new int[m][n];
    int sum[][]=new int[m][n];
    System.out.print("Enter the elements of first matrix");
    for(int c=0;c<m;c++)
    {
    	for(int d=0;d<n;d++)
    	{
    		first[c][d]=sc.nextInt();
    	}
    }
    System.out.print("Enter the elements of second matrix");
    for(int c=0;c<m;c++)
    {
    	for(int d=0;d<n;d++)
    	{
    		second[c][d]=sc.nextInt();
    	}
    }
    for(int c=0;c<m;c++)
    {
    	for(int d=0;d<n;d++)
    	{
    		sum[c][d]=first[c][d]+second[c][d];
    	}
    }
    System.out.println("Sum of entered matrices:-");
    
    for (int c = 0 ; c < m ; c++ )
    {
       for (int d = 0 ; d < n ; d++ )
          System.out.print(sum[c][d]+"\t");

       System.out.println();
    }
	}

}
