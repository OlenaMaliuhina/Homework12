import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Player1 extends Player{
    Logger log2 = Game.log;
    public Player1(String name) {
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
                    log2.error("Invalid move was made");
                   }
        }
    }
}