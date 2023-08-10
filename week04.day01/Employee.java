package week04.day001;

public class Employee {

	public void getEmployeeInfo(String name) {
		System.out.println("Name: " + name);
	}

	public void getEmployeeInfo(int age) {
		System.out.println("Age: " + age);
	}

	public void getEmployeeInfo(boolean fresher) {
		System.out.println("Fresher: " + fresher);
	}

	public void getEmployeeInfo(char sex) {
		System.out.println("Sex : " + sex);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee();
		obj.getEmployeeInfo("Hari");
		obj.getEmployeeInfo(24);
		obj.getEmployeeInfo(true);
		obj.getEmployeeInfo('M');
	}

}
