import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sleep = scanner.nextInt();

        if (sleep < a) {
            System.out.println("Deficiency");
        } else if (sleep > b) {
            System.out.println("Excess");
        } else if (sleep >= a && sleep <= b) {
            System.out.println("Normal");
        }
    }
}