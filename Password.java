import java.util.Random;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String numbers = "0123456789";

        System.out.print("Enter the length of the numeric password: ");
        int length = sc.nextInt();

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomChar = numbers.charAt(random.nextInt(numbers.length()));
            password.append(randomChar);
        }

        System.out.println("Generated Numeric Password: " + password);

        sc.close();
    }
}

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.print("Enter the length of the alphabetic password: ");
        int length = scanner.nextInt();

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomChar = letters.charAt(random.nextInt(letters.length()));
            password.append(randomChar);
        }

        System.out.println("Generated Alphabetic Password: " + password);

        scanner.close();
    }
}

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String symbols = "!@#$%^&*()_+-=[]{}|;:',.<>?/";

        System.out.print("Enter the length of the special symbols password: ");
        int length = scanner.nextInt();

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomChar = symbols.charAt(random.nextInt(symbols.length()));
            password.append(randomChar);
        }

        System.out.println("Generated Symbolic Password: " + password);

        scanner.close();
    }
}

