import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String primer = scanner.nextLine();
        String[] argss = primer.split(" ");
        String operator = argss[1];
        long n1 = Long.parseLong(argss[0]);
        long n2 = Long.parseLong(argss[2]);
        long result = 0;

        switch (operator) {
            case "+":
                result = n1 + n2;
                System.out.println(result);
                break;
            case "-":
                result = n1 - n2;
                System.out.println(result);
                break;
            case "/": {
                if (n2 != 0)  {
                    result = n1 / n2;
                    System.out.println(result);
                    break;
                } else {
                    System.out.println("Division by 0!");
                    break;
                }
            }
            case "*":
                result = n1 * n2;
                System.out.println(result);
                break;
            default:
                System.out.println("Unknown operator");
        }


    }
}