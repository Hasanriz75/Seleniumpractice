import java.util.*;

public class prac {

	public static void main(String[] args) {
		// Taking Input
		
//		Scanner sc = new Scanner(System.in);
//		String name = sc.next();
//		System.out.print("Name is " + name);	
		
		String fname = "Hasan";
		String lname = "Sardar";
		String fullname = fname +""+ lname ;
	    System.out.println(fullname);
		System.out.println(fullname.length());
		System.out.println(fullname.toLowerCase());
	    System.out.println(fullname.substring(6));
		System.out.println(fullname.substring(2,6));
		System.out.println(fullname.replace('S', 'p'));
		System.out.println(fullname.replace("san", "gas"));
		    }
	}


