package assignment_25_03;
import java.util.*;

public class TestOccurrence {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		
		char ch = sc.next().charAt(0);
		
		int count=0;
		for (int i=0;i<s1.length();i++){
			if (s1.charAt(i)==ch){
				count++;
			}else{
				continue;
		}
		}
		System.out.println("The occurrences of the character "+ch+" in th given string is "+count);
			
				
	
	
		
		
	}
	
}
