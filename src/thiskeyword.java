public class thiskeyword {

	int g=100;
	int a=8;
	int b=4;
	String c = "hasan";
	
	 void addit(int a , int b, int g){
		 
		this.g=g;
		int minus = a - b;
		System.out.println(minus);
	}
	thiskeyword(int a, int b){
		this.a = a ;
		this.b = b ;		
	}
	
	public static void main(String[] args) {
	
		thiskeyword d = new thiskeyword(100,30);
		d.addit(100,29,51);

		int e = d.a - d.b;
		System.out.println(e +" " + d.c);
		System.out.println(d.g);
	}
}


