import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Print 'HELLO WORLD'");
            System.out.println("2. Print the table of a number");
            System.out.println("3. Calculate and print the sum of digits of a number");
            System.out.println("4. Check if a number is a spy number");
            System.out.println("5. Print a word and a line together");
            System.out.println("6. Reverse a string");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("HELLO WORLD");
                    break;

                case 2:
                    printNumberTable();
                    break;

                case 3:
                    calculateSumOfDigits();
                    break;

                case 4:
                    checkSpyNumber();
                    break;

                case 5:
                    printWordAndLineTogether();
                    break;

                case 6:
                    reverseString();
                    break;

                case 7:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    public static void printNumberTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " X " + i + " = " + result);
        }
    }

    public static void calculateSumOfDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;
        int originalNum = num;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("Sum of digits in " + originalNum + " is: " + sum);
    }

    public static void checkSpyNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int originalNum = num;
        int product = 1;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        if (sum == product) {
            System.out.println(originalNum + " is a Spy number.");
        } else {
            System.out.println(originalNum + " is not a Spy number.");
        }
    }

    public static void printWordAndLineTogether() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter a line: ");
        String line = scanner.nextLine();

        System.out.println(word + " " + line);
    }

    public static void reverseString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}
