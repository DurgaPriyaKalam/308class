
public class Employee {
int empid;
String name;
int salary;
void getValues(int i,String s,int money) {
	empid=i;
	name=s;
	salary=money;
	}
void display()
{
	 System.out.println(empid+"   "+name+"   "+salary);
}
public static void main(String[] args)
{
	Employee e= new Employee();
	e.getValues(2546,"Priya",85675);
	e.display();
}
}

