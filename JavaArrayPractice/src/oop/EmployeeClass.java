package oop;

public class EmployeeClass {

	// class contain variable and methods
	
	int employee_id;
	String e_Fname, e_Lastname;
	String job;
	int salary;
	
	
	void display() {
		System.out.println(employee_id);
		System.out.println(e_Fname);
		System.out.println(e_Lastname);
		System.out.println(job);
		System.out.println(salary);
		
	}
	
	void Em_salary(int sal) {
		System.out.println("------------>"+sal);
	}
	

	
	
	public static void main(String[] args) {
		
		EmployeeClass obj =new EmployeeClass();
		obj.display();
		obj.Em_salary(6);
		obj.Em_salary(777);
	}

}
