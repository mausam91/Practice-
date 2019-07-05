public class VipCustomer {

    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer() {
        this("Mausam","mausampatel.91@gmail.com",100000);
    }

    public VipCustomer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
