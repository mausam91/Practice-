public class SharedDigits {
    public static boolean hasSharedDigit(int a,int b){
        if (a < 10 || b < 10 || a > 99 || b > 99) {
        return false;
    }

int originalB;
int digitA;
while(a!=0){
    originalB=b;
    digitA=a%10;
    while (originalB!=0){


        if( (digitA==originalB%10)) {
            return true;
        }
        originalB/=10;
    }

    a/=10;
        }
        return false;
}
//public static boolean hasSharedDigits(int a, int b) {
//
//    if (a < 10 || b < 10 || a > 99 || b > 99) {
//        return false;
//    }
//
//    int originalB;
//    int digitA;
//    while (a != 0) {
//        originalB = b;
//        digitA = a % 10;
//        while (originalB != 0) {
//            if (digitA == originalB % 10) {
//                return true;
//            }
//            originalB /= 10;
//        }
//        a /= 10;
//    }
//    return false;
//}

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,13));
    }
}
