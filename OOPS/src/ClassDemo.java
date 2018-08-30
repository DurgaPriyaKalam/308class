public class ClassDemo {
	String name;
	int age;
	String breed;
	void dogName()
	{
		System.out.println(name);
	}
	void hungry()
	{
		System.out.println("yes");
	}
	void getAge()
	{
		System.out.println(age);
	}
	void getBreed()
	{
		System.out.println("The dog breed is:"+breed);
	}
	
	public static void main(String[] args) {
		ClassDemo obj=new ClassDemo();
		obj.name="Kitty";
		obj.age=8;
		obj.breed="labrador";
		obj.dogName();
		obj.hungry();
		obj.getAge();
		obj.getBreed();
		//System.out.println(s);
		System.out.println(obj.age+""+obj.breed+""+obj.name);
		
	}
	}
	
	

