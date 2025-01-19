public class Lab_1 {
    public static void main(String[] args) 
    {

        // Sum, product, and difference of two numbers
        int a = 20;
        int b = 10;
        System.out.println("Sum: " + (a + b));
        System.out.println("Product: " + (a * b));
        System.out.println("Difference: " + (a - b));

        // Array of numbers
        int[] num = { 10, 15, 20, 25, 30 };
        int sum = 0;
        double avg;

        // Calculate sum and average
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("The sum is: " + sum);
        avg = sum / 5.0;
        System.out.println("The average value is: " + avg);

        // Print even numbers
        System.out.println("Printing Even Numbers: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
            }
        }

        // Print odd numbers
        System.out.println("Printing Odd Numbers: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 1) {
                System.out.println(num[i]);
            }
        }

        // Print multiplication table for 12
        System.out.println("Printing Multiplication Table for 12:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("12 x " + i + " = " + (12 * i));
        }

        // Print prime numbers in the array
        System.out.println("Printing Prime Numbers:");
        for (int i = 0; i < num.length; i++) {
            boolean isPrime = true;
            if (num[i] <= 1) {
                isPrime = false;
            }
            for (int j = 2; j * j <= num[i]; j++) {
                if (num[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num[i]);
            }
        }
    }
}
