package assignment_25_03;

import java.util.Scanner;

public class TestLexicographicallyEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two string ");
		String input1 = sc.nextLine();
		String input2 = sc.next();
		
		int output = input1.compareTo(input2);
		
		if (output<0)
			System.out.println(input1+" is less than "+input2);
		else if(output>0)
			System.out.println(input2+" is less than "+input1);
		else
			System.out.println("Both are lexicographically equal");
		
	
	}

}
