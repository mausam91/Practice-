public class FacterPrinter {
    public static  void printFactor(int a) {
        if (a < 1) {
            System.out.println("Invalid Value");
        }
        int x = 0;
        int factor=1;
        while (a != 0) {
            for (int i = 2; i <a; i++) {
                x = a % i;
                if (x == 0) {
                    System.out.println( i);
                    factor=i;
                    continue;

                }
            }
            break;

        }
    }


    public static void main(String[] args) {
       printFactor(25);
    }
}
