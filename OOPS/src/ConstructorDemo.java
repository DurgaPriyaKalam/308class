
public class ConstructorDemo {
int i;
String s;
public ConstructorDemo()
{
	System.out.println("i am in the constructor");
}
public ConstructorDemo(String s)
{
	System.out.println("i am in the constructor" +" "+s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo obj=new ConstructorDemo();
		ConstructorDemo obj1=new ConstructorDemo("ghv");
	}

}
