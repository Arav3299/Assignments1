package assignment_25_03;

public class TestStringImmutable {

	private static void check(String s1,String s2){
		if(s1==s2){
			System.out.println("Both are pointing to the same reference");
		}else
			System.out.println("Both are pointing to the different reference");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 ="Java";
		String s2 ="Java";
		System.out.println("Before modification !");
		check(s1,s2);
		s1+="Training";
		System.out.println("After modification !");
		check(s1,s2);
		
	}

}
