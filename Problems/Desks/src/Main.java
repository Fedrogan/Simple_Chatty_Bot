import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int g1 = scanner.nextInt();
        int g2 = scanner.nextInt();
        int g3 = scanner.nextInt();
        int g4 = scanner.nextInt();

        System.out.println(--g1 + " " + --g2 + " " + --g3 + " " + --g4);

    }
}