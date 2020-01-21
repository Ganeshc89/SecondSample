package org.emp;

public class Employee {
	public void empId(int a) {
	
		System.out.println("Employee ID in Int:" + a);

	}
	public void empId(float a) {
		System.out.println("Employee ID in float:" + a);

	}
    public void empId(double a) {
	System.out.println("Employee ID in double :" + a);

}
    public void empId(long a) {
		System.out.println("Employee ID in long:" + a);
	}
    public void empId(boolean a) {
		System.out.println("Employee ID in Boolean:" + a);

	}
    public static void main(String[] args) {
		Employee e = new Employee();
		e.empId(12345);
		e.empId(12345.68);
		e.empId(1234567.89);
		e.empId(1234567890l);
		e.empId(true);
	}
}
