import java.util.Scanner;

class Main {

    /*Write a program, which reads the number of direction (1 – up, 2 – down, 3 – left, 4 – right,
    0 – do not move) and outputs the text "move up" (or "move down", or "move left", or "move right", or "do not move" depending on the entered number). If it is a number that does not belong to any of the listed directions, the program should output "error!"

Note: the output text should exactly match the sample, including the letters’ case and location of spaces.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String move = "";
        switch (scanner.nextInt()) {
            case 1 -> move = "up";
            case 2 -> move = "down";
            case 3 -> move = "left";
            case 4 -> move = "right";
            case 0 -> {
                System.out.print("do not move");
                System.exit(0);
            }
            default -> {
                System.out.print("error!");
                System.exit(0);
            }
        }
        System.out.printf("move %s", move);
    }
}