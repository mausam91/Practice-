

public class Person {
    private int Id = 0;
    private String  name;
    private Type myTP;

    public Person() {
    }

    public Type getMyTP() {
        return myTP;
    }

    public void setMyTP(Type myTP) {
        this.myTP = myTP;
    }

    public Person( String name, Type mytp) {
        Id = ++this.Id;
        this.name = name;
        this.myTP = mytp;
    }

    public Person(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public enum Type{
        Invoice, PurchaseOrder
    }
    public String toString(){
        return "Id : "+getId() +"/n Name: "+getName() +"/n Type : "+getMyTP();
    }
}
