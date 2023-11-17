import java.util.Scanner;

public class Player2 extends Player{
    public Player2(String name) {
        super(name);
    }
    public void makeMove() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(name + ", enter your move (ROCK, PAPER, SCISSORS): ");
            String input = scanner.nextLine().toUpperCase();
            try {
                move = Move.valueOf(input);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid move. Please choose ROCK, PAPER, or SCISSORS.");
            }
        }
    }
}