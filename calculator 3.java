import java.util.Scanner;

class Calculator {
    // Addition for float
    public float add(float a, float b) {
        return a + b;
    }

    // Subtraction for long
    public long subtract(long a, long b) {
        return a - b;
    }

    // Multiplication for double
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division for double
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero.");
            return 0;
        }
    }

    // Modulus for int
    public int modulus(int a, int b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Error: Division by zero in modulus.");
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        // Float input
        System.out.print("Enter first float number: ");
        float f1 = scanner.nextFloat();
        System.out.print("Enter second float number: ");
        float f2 = scanner.nextFloat();
        System.out.println("Addition (float): " + calc.add(f1, f2));

        // Long input
        System.out.print("\nEnter first long number: ");
        long l1 = scanner.nextLong();
        System.out.print("Enter second long number: ");
        long l2 = scanner.nextLong();
        System.out.println("Subtraction (long): " + calc.subtract(l1, l2));

        // Double input
        System.out.print("\nEnter first double number: ");
        double d1 = scanner.nextDouble();
        System.out.print("Enter second double number: ");
        double d2 = scanner.nextDouble();
        System.out.println("Multiplication (double): " + calc.multiply(d1, d2));
        System.out.println("Division (double): " + calc.divide(d1, d2));

        // Int input
        System.out.print("\nEnter first int number: ");
        int i1 = scanner.nextInt();
        System.out.print("Enter second int number: ");
        int i2 = scanner.nextInt();
        System.out.println("Modulus (int): " + calc.modulus(i1, i2));
    }
}
