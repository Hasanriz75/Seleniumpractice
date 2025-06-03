package java;

class WildAnimal {
	void Lion () {
		System.out.print("Wild animal ");
			}
}
class Eat extends WildAnimal {
	void Meat(){
		System.out.print("eats meet");
	}
	void Cool() {
		System.out.print(" in cold");
			
	}
}


public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Eat tiger = new Eat();
tiger.Lion();
tiger.Meat();
tiger.Cool();
	}
}
