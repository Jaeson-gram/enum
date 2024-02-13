public enum Toppings {
    CHEDDAR,
    TOMATO,
    CHEESE,
    HAM,
    PICKLES,
    MUSTARD,
    BACON; //adding a colon because we're to add customisation

    public double getPrice(){
        return switch (this) {
            case HAM -> 1.5;
            case BACON -> 0.9;
            case CHEDDAR -> 1.0;

            default -> 0.3;
        };
    }
}
//beneath