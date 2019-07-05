public class PerfactNumber {

    public static  boolean isPerfactNumber(int a) {
        if (a < 1) {
            return false;
        }
        int x = 0;
        int sum=0;

        while (a != 0) {
            for (int i = 1; i <= a; i++) {
                x = a % i;

                if (x == 0) {
                    sum+=i;
                    System.out.println( i);

                    continue;

                }
                if(a==sum){
                    return  true;
                }
            }
            break;

        }
        return  false;

    }

    public static void main(String[] args) {
        System.out.println(isPerfactNumber(-1));
    }
}
