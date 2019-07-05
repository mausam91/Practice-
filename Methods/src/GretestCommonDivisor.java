public class GretestCommonDivisor {
    public static  int getGretestCommonDivisor(int num1,int num2){
        if(num1<10 ||num2<10) return -1;
     int smallestNumber= num1<num2 ? num1:num2;
     int commonDivisor=1;
     for(int i =2;i<smallestNumber;i++){
         if(num1%i == 0 && num2%i==0){
             commonDivisor=i;
         }
     }



        return  commonDivisor;
    }
//
//    public static  int getGreatestCommonDivisor(int num1,int num2){
//        if(num1<10 ||num2<10) return -1;
//        int x=0;
//        int maxNum=0;
//
//        while(num1<num2){
//            for(int i=1;i<num1;i++){
//                x= num1%i;
//                if(x==0) {
//                    System.out.println("divisor num1: " + i);
//                    maxNum=i;
//                    if(maxNum<i){
//                        maxNum=i;
//                        System.out.println(maxNum);
//                    }
//                    continue;
//
//                }
//            }
//            break;
//
//        }
//        while(num1>num2){
//            for (int j = 1; j<num2;j++){
//                x=num2%j;
//                if(x==0){
//                    System.out.println("divisor num2: " + j);
//                    maxNum=j;
//                    if(maxNum<j){
//                        maxNum=j;
//                        System.out.println(maxNum);
//                    }
//                    continue;
//                }
//            }
//            break;
//        }
//
//        return  maxNum;
//    }

    public static void main(String[] args) {
        System.out.println(getGretestCommonDivisor(81,153));
    }
}
