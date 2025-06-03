package java;
import java.util.Arrays;
import java.util.Scanner;

public class stringprog {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner M1 = new Scanner(System.in);
	
	
	System.out.print("First String is " );
	String S1 = M1.next();
	System.out.print("Second String is " );
	String S2 = M1.next();

	if (S1.length()!=S2.length()) {
		System.out.println("Its not anagram as length is different");
	}
	else {
		char ch1[] = S1.toCharArray();
	char ch2[] = S2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	System.out.println(ch1);
	System.out.println(ch2);
	if  (Arrays.equals(ch1,ch2)) {
		System.out.println("Its anagram");
	}
	else {
		System.out.println("Its not anagram");

	}
	M1.close();
	}
	}
	
}
