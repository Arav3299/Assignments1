package assignment_25_03;

import java.util.Scanner;

public class TestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1=sc.next();
		StringBuilder sb = new StringBuilder();
		sb.append(s1);
		sb.reverse();
		String s2 = sb.toString();
		int count=0;
		for (int i=0;i<s1.length();i++){
			if(s1.charAt(i)==s2.charAt(i)){
				count++;
			}else
			{
			System.out.println("The given string is not palindrome");
			break;
			}
		}
		if(count==s1.length()){
			System.out.println("The given string is palindrome");
		}
	}

}
