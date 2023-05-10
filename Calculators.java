package week1.day4;

public class Calculators {
	
	public void additionTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println("Addition ;"+c);
		
	}
	
	public void subractionTwonumber(int e,int f) {
		int g=e-f;
		System.out.println("Subraction ;"+g);
		
	}
	
	public void multipleTwoNumber(double i,double j) {
		double k=i*j;
		System.out.println("Multiplication ;"+k);
		
	}
	
	public void divideTwoNumber(float x,float y) {
		float z=x/y;
		System.out.println("Division ;"+z);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc=new Calculator();
		calc.addtwonumber(40,6);
		calc.subtwonumber(876,567);
		calc.multipleTwoNumber(66,8);
		calc.divideTwoNumber(44,2);
		

	}

}
