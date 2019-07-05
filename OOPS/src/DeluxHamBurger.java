public class DeluxHamBurger extends HamBurger {
    private Aditions chips;
    private Aditions drinks;

    public DeluxHamBurger(BreadRoll breadRoll, int meat, double basePrice, Aditions chips, Aditions drinks) {
        super(breadRoll, meat, basePrice);
        this.chips = chips;
        this.drinks = drinks;
    }



}
