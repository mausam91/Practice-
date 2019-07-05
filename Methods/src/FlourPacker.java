public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int howManyBagsWeNeed = goal / 5;
        if (howManyBagsWeNeed >= bigCount) {
            return goal - (bigCount * 5) <= smallCount;
        }
        return goal % 5 <= smallCount;
    }
//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//
//
//        int SmallBagKG = 1;
//        int TotalAvailableBigKG = bigCount * 5;
//        int TotalAvailableSmallKG = SmallBagKG * smallCount;
//
//
//        if (goal % 5<=smallCount) {
//
//            return true;
//        } else {
//
//            return false;
//        }
//    }



//
//        int TotalSumofWeight = TotalAvailableBigKG + TotalAvailableSmallKG;
//
//        if (bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        } else if (TotalSumofWeight >= goal) {
//
//if (bigCount>=goal) {return true;}
//else{
//   int  remainingGoal = ;
//   if (remainingGoal>=bigCount){
//       return true;
//   }
//   else{
//       return false;
//   }
//}
//
//
//        }
//        else {
//
//            return  false;
//
//        }
//    }









//       if(bigCount<0||smallCount<0||goal<0) return false;
//
//       int goalSum =bigCountSum+smallCount;
//        if(goalSum>bigCountSum)  return true;
//       if (goalSum>=goal){
//           if(bigCountSum>goal) return false;
//           return true;
//       }
//       return false;
//
//    }
//public static boolean canPack(int bigCount ,int smallCount,int goal){
//    int bigCountSum=bigCount*5;
//
//    if(bigCount<0||smallCount<0||goal<0) return false;
//
//    while(goal>=5 && bigCount>0){
//        goal=goal-5;
//        bigCount--;
//    }
//    if(smallCount>=goal) return true;
//    return false;
//
//}


    public static void main(String[] args) {
        System.out.println(canPack(1,0,5));
    }
}
