public class Vehical {
    private String type;
    private double value;

    public Vehical(String type, double value) {
        this.type = type;
        this.value = value;
    }

    public static double chargTax(double value) {
        if (value > 100000000) {
            return value * 0.2;
        } else
            return value * 0.16;
    }

    public double discount(double value, String type) {
        if (!(type != "family" || value <= 50000000)) return value * 0.08;

        return 0; // return according to the logic

    }
}