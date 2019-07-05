public class SumEvenNumber {
    public static int getEvenDigitsSum(int number){
        if (number<0)return -1;
        int saprateNumber=0;
        int sum=0;
        while (number!=0) {
            saprateNumber   = number % 10;
            System.out.println("sn = "+saprateNumber);
            number /= 10;
            //System.out.println("n= "+number);

            while(saprateNumber%2 ==0){
                sum=sum+saprateNumber;
                break;
            }



        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitsSum(245600038));
    }
}
