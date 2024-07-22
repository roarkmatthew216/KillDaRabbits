package cards;




public class Card {
    public enum Type{
        StarterCard,//kaballas market
        CarrotSupply,//carrot cards
        Run,
        Special,
        VerySpecial,
        PlayImmediately,
        KaballaDolla;
        private static final Type[] values = Type.values();
        public static Type typeFromInt(int i){
            return values[i];
        }
    }
    private Type type;
    private String title;
    
    public Card(Type type, String title){
        this.type = type;
        this.title = title;
    }
    public Type getValue(){
        return this.type;
    }
    public String getTitle(){
        return this.title;
    }
}
