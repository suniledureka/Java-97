
class Employee 
{
	int empno;
	String name;
	float sal;
	
	Employee(){	}
	
	Employee(int empno, String name){	
		this.empno = empno;
		this.name = name;
	}

	Employee(int a, String b, float c){
		this(a,b); //constructor chaining
		/*
		this.empno = a;
		this.name = b;
		*/
		this.sal = c;
	}

	void getDetails(){
		System.out.println(this.empno + " | " + this.name + " | " + this.sal);
	}
	public static void main(String[] args) 
	{
		System.out.println("in class Employee");
	}
}

class OverloadingConstructors 
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(101, "Sanjay");
		Employee emp3 = new Employee(102, "Praveen", 2500f);

		emp1.getDetails();
		emp2.getDetails();
		emp3.getDetails();
	}

}
