import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 99 && n < 1000) {
            int firstDigit = n / 100;
            int secondDigit = n / 100 % 10;
            int thirdDigit = n % 10;

            System.out.println(firstDigit + secondDigit + thirdDigit);
        }
    }
}