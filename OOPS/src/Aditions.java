public class Aditions {
    private Double basePrice;
    private boolean islettuce;
    private boolean isTomato;
    private boolean isCarrot;

    public Aditions(boolean islettuce, boolean isTomato, boolean isCarrot) {
        this.islettuce = islettuce;
        this.isTomato = isTomato;
        this.isCarrot = isCarrot;
        this.basePrice=1.5d;

    }

    public boolean isIslettuce() {
        return islettuce;
    }

    public boolean isTomato() {
        return isTomato;
    }

    public boolean isCarrot() {
        return isCarrot;
    }

    public double priceOfAditions(int howManyAditions){
        return howManyAditions*basePrice;
    }
}
