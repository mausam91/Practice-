public class SumOddNumbers {

    public static boolean isOdd(int n){
        if(n>0){
            if((n%2)!=0) return true;

        }
        return false;
    }
    public static int sumOdd(int start,int end){
        if((start>0) && (end>0) &&(start<end)) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    System.out.println(i);

                    sum += i;

                }

            }
            return sum;
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(isOdd(-3));
        System.out.println(sumOdd(10,5));
    }
}
