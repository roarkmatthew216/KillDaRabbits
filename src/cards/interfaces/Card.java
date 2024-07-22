package cards.interfaces;

public interface Card {
    public enum Type{
        StarterCard,//kaballas market
        CarrotSupply,//carrot cards
        Run,
        Special,
        VerySpecial,
        PlayImmediately,
        KaballaDolla;
        private static final Type[] values = Type.values();
        public static Type typeFromString(String name){
            for (Type type : values) {
                if(type.name().equals(name)){
                    return type;
                }
            }
            return null;
        }
    }
    public Type getValue();
}
