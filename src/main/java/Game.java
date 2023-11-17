import java.util.Objects;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Game {
       protected static final Logger log = LogManager.getLogger(Game.class);
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player 1 please enter your name: ");
        String playerName1 = scanner.nextLine();
        Player1 player1 = new Player1(playerName1);
            log.info("Player1 entered the name");
        System.out.print("Player 2 please enter your name: ");
        String playerName2 = scanner.nextLine();
        Player2 player2 = new Player2(playerName2);
            log.info("Player2 entered the name");

        if (Objects.equals(player2.getName(), player1.getName())) {
            log.trace("pay attention it's a test user");
        }

        while (true) {
            player1.makeMove();
            player2.makeMove();

            System.out.println(player1.getName() + " chose " + player1.getMove());
            System.out.println(player2.getName() + " chose " + player2.getMove());

            Move player1Move = player1.getMove();
            Move player2Move = player2.getMove();

            if (player1Move == player2Move) {
                System.out.println("It's a tie! Nobody wins");
                log.trace("Log message - Nobody wins");
            } else if ((player1Move == Move.ROCK && player2Move == Move.SCISSORS) ||
                    (player1Move == Move.PAPER && player2Move == Move.ROCK) ||
                    (player1Move == Move.SCISSORS && player2Move == Move.PAPER)) {
                System.out.println(player1.getName() + " wins!");
            } else {
                System.out.println(player2.getName() + " wins!");
            }

            System.out.print("Play again? (yes/no): ");
            String playAgain = scanner.nextLine();
            if (!playAgain.equalsIgnoreCase("yes")) {
                log.debug("the game is finishing");
                break;
            }
        }
        System.out.println("Thank you for playing!");
        log.fatal("the game is over");
    }
}