package week04.day04;

public class Automation extends MultipleLanguage implements Language, TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation obj = new Automation();
		obj.python();
		obj.selenium();
		obj.java();
		obj.ruby();
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Automation--Selenium");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Automation--Java");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Automation--Ruby");
	}

}
