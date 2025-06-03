package java;

class Calculator {
    
    // Overloaded method for addition
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method for addition with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method for addition with double type
    double add(double a, double b) {
        return a + b;
    }
}


public class methodoverloading {
	public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println(calc.add(2, 3));        // Calls the method with two int parameters
        System.out.println(calc.add(1, 2, 3));     // Calls the method with three int parameters
        System.out.println(calc.add(2.5, 3.5));    // Calls the method with two double parameters
    }
}

