public class PalindromeNumber {

//       int temp=n;
//        int sum=0;
//        while(n!=0){
//           int  digites=n%10;  //getting remainder
//            sum=(sum*10)+digites;
//            n=n/10;
//        }
//        if(temp==sum)
//            return true;
//        else
//         return  false;
//}
public static boolean isPalindrome(int n) {

        int sum=0;
        while(n!=0){
            int digits=n%10;
            System.out.println( "digtid:"+digits);
            sum=sum*10+digits;
            System.out.println("sum"+sum);
            n=n/10;
           System.out.println("n"+n);
        }
        if(n==sum) return true;
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(-19167));
    }

}
