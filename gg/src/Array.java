import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
        int[] array= {5,2,6,7,4};
        for(int t:array)
        {
        	System.out.println(t+"");
        }
        System.out.println();
        for(int i=0;i<array.length;i++)
        {  
        	for(int j=i+1;j<array.length;j++)
        	{
        		if(array[i]>array[j])
        		{
        			int temp=array[i];
        			array[i]=array[j];
        			array[j]=temp;
        		}
        	}
        }
        for(int t:array)
        {
        	System.out.println("The values are:"+t);
        }
	}

}
