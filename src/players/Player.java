package players;

import java.util.ArrayList;
import cards.Card;

public class Player {
    private String name;
    private ArrayList<Card> hand = new ArrayList<Card>();
    private ArrayList<Card> runCards = new ArrayList<Card>();
    // private ArrayList<Card> carrotCard = new ArrayList<Card>();
    // private ArrayList<Card> waterCards = new ArrayList<Card>();
    // private ArrayList<Card> cabbageCards = new ArrayList<Card>();

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void addCard(Card card){
        hand.add(card);
    }
    public void removeCard(Card card){
        hand.remove(card);
    }
    public void listCards(){
        for (Card card : hand) {
            System.out.println(card.getTitle());
        }
    }
}
