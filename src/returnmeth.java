class Employees {

		int salary;
		String name;
		String n ;
		public int getsalary() {
			return salary;
		}
		public String getname() {
			return name;
		}
		public String setname(String n) {
			return n;
		
		
		
		}
	}
public class returnmeth {
	public static void main (String[] args) {
		Employees hasan = new Employees();
		hasan.name="Abbas";
		System.out.println(hasan.getname());
		hasan.salary=3000;
		System.out.println(hasan.getsalary());
		
		System.out.println(hasan.setname("hASSU"));
}
}

