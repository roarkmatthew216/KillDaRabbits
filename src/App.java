import cards.*;
import java.util.ArrayList;
import players.Player;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Player> players = new ArrayList<Player>();
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");
        players.add(player1);
        players.add(player2);
        Game game = new Game(players);
        game.listPlayers();
        game.startGame();
        game.endGame();
       

    }
}
