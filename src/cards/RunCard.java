package cards;

public class RunCard extends Card {
 
    public RunCard(String title){
        super(Type.Run, title);
    }
    
    public void playCard(){
        System.out.println("Run card played");
    }
}
