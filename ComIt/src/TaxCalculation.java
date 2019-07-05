public class TaxCalculation {
    public double gst(double net){
        return net * .05;
    }
    public double pst(double net){
        return net * .06;
    }
    public double total(double net){
        return gst(net)+pst(net)+net;
    }
}
