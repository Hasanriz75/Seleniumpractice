package grotechminds;
class Override{
	void login() {
		
		System.out.println("No1");
		}
}
public class SUPER extends Override{
   void login(){
		
		System.out.println("No2");
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SUPER m1 = new SUPER();
      m1.login();
	}

}
