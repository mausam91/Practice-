public class NumberToWords {
    public static void numberToWords(int n){
        if(n<0) {
            System.out.println("Invalid Value");
        }
        if (n == 0) {
            System.out.println("Zero");
        }

        int x =reverse(n);


        int differnce =getDigitCount(n)- getDigitCount(x);

        String numWord;
        while( x>0 ){
           int reversDigits=x%10;
            switch (reversDigits) {
                case 0:
                    numWord = "Zero";
                    break;
                case 1:
                    numWord = "One";
                    break;
                case 2:
                    numWord = "Two";
                    break;
                case 3:
                    numWord = "Three";
                    break;
                case 4:
                    numWord = "Four";
                    break;
                case 5:
                    numWord = "Five";
                    break;
                case 6:
                    numWord = "Six";
                    break;
                case 7:
                    numWord = "Seven";
                    break;
                case 8:
                    numWord = "Eight";
                    break;
                case 9:
                    numWord = "Nine";
                    break;
                default:
                    numWord = "Not a number";
                    break;
            }
            System.out.println(numWord);
            x/=10;
        }

        for (int i=0; i<differnce;i++) {
            System.out.println("Zero");
        }




    }

    public static int reverse(int a){
        int reverseNumber=0;
        while(a!=0){
            int digits=a%10;
            reverseNumber=reverseNumber*10+digits;
            a/=10;


        }
        return reverseNumber;


    }

    public static int getDigitCount(int n){
        if(n<0) return -1;
        if(n==0)return 1;
        int sum=0;
        int count =0;
        while (n!=0) {

            int digits=n%10;
            count++;


            n=n/10;


        }

return count;
    }



    public static void main(String[] args) {
        numberToWords(-222);
        System.out.println(getDigitCount(0));

    }
}