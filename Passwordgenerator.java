import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Passwordgenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_+-=[]{}|;:',.<>?/";

        
        System.out.println("Welcome to Password Generator");

        
        System.out.print("How many letters do you want in your password? ");
        int numLetters = scanner.nextInt();

        System.out.print("How many numbers do you want in your password? ");
        int numNumbers = scanner.nextInt();

        System.out.print("How many symbols do you want in your password? ");
        int numSymbols = scanner.nextInt();

        List<Character> passwordList = new ArrayList<>();

        
        for (int i = 0; i < numLetters; i++) {
            char randomChar = letters.charAt(random.nextInt(letters.length()));
            passwordList.add(randomChar);
        }

        
        for (int i = 0; i < numNumbers; i++) {
            char randomChar = numbers.charAt(random.nextInt(numbers.length()));
            passwordList.add(randomChar);
        }

        
        for (int i = 0; i < numSymbols; i++) {
            char randomChar = symbols.charAt(random.nextInt(symbols.length()));
            passwordList.add(randomChar);
        }

    
        Collections.shuffle(passwordList);

        
        StringBuilder password = new StringBuilder();
        for (char c : passwordList) {
            password.append(c);
        }

    
        System.out.println("Your generated password is: " + password);

        scanner.close();
    }
}

