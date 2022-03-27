package assignment_25_03;

import java.util.Scanner;

public class TestConcat {

	private static void concat(String s1, int c) {
		String output="";
		for (int i=0;i<c;i++){
			output+=s1;
		}
		System.out.println(output);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1=sc.next();
		System.out.println("Enter the number concat");
		int c = sc.nextInt();
		concat(s1,c);
	}

	


}
