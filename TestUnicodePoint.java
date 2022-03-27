package assignment_25_03;

import java.util.Scanner;

public class TestUnicodePoint {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int index = sc.nextInt();
		if (index<a.length()){
		System.out.println("Unicode point of the string at given index is "+a.codePointAt(index));
	}else{
		System.out.println("you have exceeded the string index limit");
		System.out.println("please re run !!!");
	}
}}
