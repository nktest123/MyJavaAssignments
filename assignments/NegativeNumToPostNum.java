package week1.assignments;

import java.util.Scanner;

public class NegativeNumToPostNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type a negative number:");
		int num = sc.nextInt();
		if(num<0)
		{
			num = num*-1;
			System.out.println("Convert negative number to positive number:"+num);
		}
		else
		if (num==0)
		{
			System.out.println("You have typed zero and not a negative number");
		}
		else
			System.out.println("You have typed a positive number");

	}

}
