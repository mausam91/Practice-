public class SimOfDigits {
    public static int sumDigits(int num) {
        if (num<10) return -1;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;


    }

    public static void main(String[] args) {
        System.out.println(sumDigits(123

        ));
    }

}
//    int num = 321;
//    int sum = 0;
//        while (num > 0) {
//                sum = sum + num % 10;
//                num = num / 10;
//                }
//                System.out.println(sum);