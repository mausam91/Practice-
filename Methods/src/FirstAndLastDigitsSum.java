public class    FirstAndLastDigitsSum {

    public static int sumFirstAndLastDigits(int number) {
        if (number < 0) return -1;


       int lDigit = number %10;

       int  fDigit=0;

       while (number!=0) {
           int  sum=0;
         int  digit=number%10;
           number /= 10;
           sum=sum*10+digit;
          System.out.println(sum);
        fDigit=sum%10;
           //System.out.println(fDigit);

       }
        return lDigit+fDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigits(10));
    }

}





