import java.util.Scanner;

public class DigitCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number to encrypt: ");
        String number = scanner.nextLine();
        
        System.out.print("Enter the permutation key (e.g., 12345): ");
        String keyStr = scanner.nextLine();
        int[] key = new int[keyStr.length()];
        for (int i = 0; i < keyStr.length(); i++) {
            key[i] = Character.getNumericValue(keyStr.charAt(i)) - 1;
        }
        
        if (number.length() != key.length) {
            System.out.println("Length of number and key must be equal!");
            return;
        }
        
        char[] digits = number.toCharArray();
        char[] encrypted = new char[digits.length];
        for (int i = 0; i < digits.length; i++) {
            encrypted[key[i]] = digits[i];
        }
        
        System.out.println("Encrypted number: " + new String(encrypted));
        
        scanner.close();
    }
}