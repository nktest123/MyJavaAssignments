package week1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1 = 0, num2 = 1, num3 = 0;
		System.out.println("Print first 11 FibonacciSeries" + '\n');
		
		for (int i = 1; i <= 11; i++) {
			System.out.println(num1);
			num3 = num2 + num1;
			//Swap
			num1 = num2;
			num2 = num3;
		}

	}

}
