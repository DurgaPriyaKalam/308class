import java.util.Scanner;
class MAD
{
   static String sub;
   void count(String s)
   {
	   sub=s;
	   System.out.println("Subject in MAD is " +sub);
   }
}
 class IP
 {
	static String sub;
	void count(String s)
	{
		sub=s;
	
		 System.out.println("Subject in IP is " +sub);
}
 }
 class PM
{
	static String sub;
	void count(String s) {
		sub=s;
		 System.out.println("Subject in PM is " +sub);
	}
}
public class ClassAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MAD m1=new MAD();
IP i=new IP();
PM p=new PM();
m1.count("Maths");
i.count("N/w");	
p.count("project");
}
}