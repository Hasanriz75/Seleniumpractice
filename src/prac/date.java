package prac;

import java.util.Date;

public class date {
public static void main(String args[]) {
	/*Date d1 = new Date();
	System.out.println(d1.getTime());
	Date d2 = new Date(d1.getTime());
	System.out.println(d2);
	String s1 = "Go for";
	String s2 = "it";
	String format1 = d2.toString();
	System.out.println(format1.substring(8,10));
	System.out.println(format1.substring(4,7));
	System.out.println(format1.substring(0,4));
	System.out.println(format1.substring(format1.length()-4));
	String format2 = s1.concat(" ").concat(s2);
	System.out.println(format2);
	*/
	
	Date d1 = new Date();
	Date d2 = new Date(d1.getTime()+(1000*60*60*24*1)); // Future date(+)
	Date d3 = new Date(d1.getTime()-(1000*60*60*24*1)); // Past date(-)
	System.out.println(d2);
	System.out.println(d3);
	}
}
