import java.util.Scanner;
public class Employee {
    String name;	
	int eno;
	float salary;
	public Employee(String name) {
	      this.name = name;
	   }
	public void empno(int empno) {
		   eno = empno;
	   }
	   public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void empSalary(float empSalary) {
	      salary = empSalary;
	   }
	public void printEmployee() {
	      System.out.println("Name:"+ name );
	      System.out.println("Age:" + eno );
	      System.out.println("Salary:" + salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee empOne = new Employee("Priya");
	      empOne.empno(26);
	      empOne.empSalary(1000);
	      empOne.printEmployee();
	      
	}

}
