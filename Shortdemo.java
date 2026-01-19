import java.util.Scanner;

public class ShortDemo {

    // Static variable (class-level)
    static int staticVar = 100;

    // Instance variable (object-level)
    int instanceVar = 50;

    public static void main(String[] args) {

        // Local variables – primitive data types
        int a = 10;          // 4 bytes: default integer
        double b = 5.5;      // 8 bytes: precise decimal
        boolean isValid = true; // logical true/false

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        // Input validation
        if (y == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            // Arithmetic + type casting
            double result = (double) x / y;

            // Formatted output
            System.out.printf("Sum = %d, Division = %.2f\n", x + y, result);
        }

        // Type casting
        int castValue = (int) b; // narrowing

        // Variable scope demo
        ShortDemo obj = new ShortDemo();
        System.out.println("Local: " + a);
        System.out.println("Instance: " + obj.instanceVar);
        System.out.println("Static: " + staticVar);

        sc.close();
    }
}
