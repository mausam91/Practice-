public class LastDigitChecker {
public static  boolean  hasSameLastDigit(int a, int b, int c){
 if(isValid(a)&&isValid(b)&& isValid(c)){
     int lastDigitA= a%10;
     System.out.println(lastDigitA);
    int lastDigitC=c%10;
     System.out.println(lastDigitC);
     int lastDigitB=b%10;
     System.out.println(lastDigitB);

     while ((lastDigitA==lastDigitC)||(lastDigitA==lastDigitB)||(lastDigitB ==lastDigitC)) {
         return true;
     }
 }


    return  false;
}

public static boolean isValid(int x){
    if (x < 10 || x>=1000 ) {
        return false;
    }
    return true;
}

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(23,32,42));
    }

}
