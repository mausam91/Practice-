import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            //  Block of code to try
            Scanner reader=new Scanner(System.in);
            String customerName = "";

            double[] price = new double[5];
            String[] pName = new String[5];
            double net=0;
            Person person =new Person();



            System.out.println("-------Invoice or Purchase Order-------");
            System.out.println("For Invoice Press 1  Or For Purchase Order Press 2");
            int value= reader.nextInt();

            switch (value) {
                case 1:
                    System.out.println("Enter the customer name :");
                    customerName = reader.nextLine();
                    reader.nextLine();

                    break;
                case 2:
                    System.out.println("Enter the supplier name :");
                    customerName = reader.nextLine();
                    reader.nextLine();
                    person = new Person(customerName, Person.Type.PurchaseOrder);
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }

            if(value ==1 || value ==2) {

                for (int i = 1; i <3; i++) {
                    System.out.println("Enter the Product Name: ");
                    pName[i] = reader.nextLine();
                    System.out.println("Enter the Price: ");
                    price[i] = reader.nextDouble();
                    net += price[i];
                }

            }
            TaxCalculation tc= new TaxCalculation();

        System.out.println("Id : " +person.getId());
        System.out.println("Name"+customerName);
        System.out.println("Type : "+person.getMyTP());
        System.out.println( tc.gst(net));
        System.out.println(tc.pst(net));
        System.out.println( tc.total(net));







        reader.close();


    }
}
