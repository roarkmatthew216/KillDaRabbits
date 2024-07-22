import java.util.ArrayList;
import players.Player;
import cards.Card;
import cards.RunCard;

public class Game {
    private ArrayList<Player> players;
    private boolean gameIsGoing;

    public Game(ArrayList<Player> players){
        this.players = players;
        gameIsGoing = false;
        System.out.println("Game created");
    }
    public void addPlayer(Player player){
        players.add(player);
    }
    public void removePlayer(Player player){
        players.remove(player);
    }
    public void listPlayers(){
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }
    public void startGame(){
        System.out.println("Game started");
        gameIsGoing = true;

        for (Player player : players) {
            player.addCard(new Card(Card.Type.StarterCard, "Kaballas Market"));
            player.addCard(new RunCard("Blue Bunny"));
            player.addCard(new Card(Card.Type.Run, "blue Bunny"));
            player.addCard(new Card(Card.Type.Special, "Special"));
            player.addCard(new Card(Card.Type.VerySpecial, "Very Special"));
            player.addCard(new Card(Card.Type.PlayImmediately, "Play Immediately"));
            player.addCard(new Card(Card.Type.KaballaDolla, "Kaballa Dolla"));
            player.listCards();
        }
        GameLoop();
    }
    public void GameLoop(){
        while (gameIsGoing) {
            // if all carrot cards are gone, do end game to see who has the magic carrot

        }
    }
    public void endGame(){
        gameIsGoing = false;
        System.out.println("Game ended");
    }

}
