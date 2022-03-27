package assignment_25_03;

import java.util.Scanner;

public class TestIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// object for scanner class
		Scanner sc = new Scanner(System.in);
		char a;
		do{
		System.out.println("Enter the String : ");
		String input = sc.next();
		System.out.println("Enter the Index of the Character : ");
		int index = sc.nextInt();
		UserMainCodeIndexChar.getIndexChar(input,index);
		a = sc.next().charAt(0);
		}while(a == 'y'|| a =='Y');
		

	}

}
