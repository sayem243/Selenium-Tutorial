package oop;

public class MethodOverloading {

	public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add an array of integers
    public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
    	MethodOverloading math = new MethodOverloading();

        // Calling the different add methods
        System.out.println("Sum of 10 and 20: " + math.add(10, 20));
        System.out.println("Sum of 10, 20, and 30: " + math.add(10, 20, 30));
        System.out.println("Sum of 10.5 and 20.5: " + math.add(10.5, 20.5));

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of array elements: " + math.add(numbers));
    }
	
	
}
