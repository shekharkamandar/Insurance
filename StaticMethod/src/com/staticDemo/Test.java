public class Test {
	
	void addition (int a, int b) {
		
		int add = a+b;
		System.out.println("Addition of "+a+" and " +b+ " is :"+add);
		
	}
	
	void substraction (int a, int b) {
		int sub = a-b;
		System.out.println("Substraction of "+a+" and "+b+" is :" +sub);
	}
	
	void multiplication (int a, int b) {
		int mul = a*b;
		System.out.println("Multiplication of "+a+" and" +b+" is :" +mul);
		
	}
	
	

void division(float a, int b) {
		float div = a/b;
		System.out.println("Division of "+a+" and "+b+" is :" +div);
		
	}
	
	void average(float a, float b) {
		
		float avg= a+b/2;
		System.out.println("Average of "+a+" and "+b+" is :" +avg);
		
	}
	
	void percentage(float a, float b, float c, float n) {
		
		float per= ((a+b+c)/n)*(100);
		System.out.println("Percentage is :" +per);
		
	}
	
	public static void main(String args[]) {
		
		Test obj1 = new Test();
		obj1.addition(30, 77);
        obj1.substraction(20, 30);
		obj1.multiplication(50, 0);
		obj1.division(15.75f, 72);
		obj1.average(15.22f, 123.5f);
		obj1.percentage(95.35f, 60.5f, 70.5f, 300);
		
	}
	

}