public class ChallangeMethod {
    public static void main(String[] args) {
       // SwitchIsLeapYear.isLeapYear(-1600);

        System.out.println(SwitchIsLeapYear.isLeapYear(9000));
        System.out.println(SwitchIsLeapYear.getDaysInMonth(1,2020));
        //  int position =calculateHighScorePosition(800);
        //    displayHighScorePosition("mausam",position);
        //  position=calculateHighScorePosition(1300);
        //   displayHighScorePosition("pinaklin",50);
        // Vehical v=new Vehical("home",7.98);
        //double ans =v.discount(233.45,"family");
        // System.out.println(BarkingDog.shoudWakeUp(true,-1));
        // System.out.println(LeapYearCalculator.isLeapYear(1924));
        // System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        // System.out.println(TeenNumberChecker.hasTeen(45,43,34));
        // System.out.println(CalcFeetAndInches.calcFeetAndInchesToCentimeter(78));
        // System.out.println(SecondsAndMinuteChallange.getDurationString(166,34));
        //System.out.println(SecondsAndMinuteChallange.getDurationString(3945));
        // System.out.println(AreaCalculator.area(-1));
        //System.out.println(AreaCalculator.area(-1,4));
        // YearAndDaysCalculator.printYearsAndDays(86345283645813645L);
        // IntEqualityPrinter.printEqual(1,2,1);
        //  System.out.println(playingCat.isCatPlaying(true,50));


        for (int i=2;i<9;i++){
            System.out.println(calculateInterest(10000,i));
        }



//        char charValue = 'G';
//        switch (charValue) {
//            case 'A':
//                System.out.println("A was found");
//                break;
//            case 'B':
//                System.out.println("B was found");
//                break;
//            case 'C':
//            case 'D':
//            case 'E':
//                System.out.println(charValue + " was found");
//                break;
//
//            default:
//                System.out.println("Could not find A, B, C, D or E");
//                break;
//        }
//
//        String month = "JuNE";
//        switch (month.toUpperCase()) {
//            case "JANUARY":
//                System.out.println("Jan");
//                break;
//            case "JUNE":
//                System.out.println("Jun");
//                break;
//            default:
//                System.out.println("Not sure");
//        }


//    }
//    public static void displayHighScorePosition(String playerName, int position){
//        System.out.println(playerName+" managed to get into position"+position+" on the high score table");
//
//    }
//    public static int calculateHighScorePosition(int playerScore){
//        if (playerScore>= 1000)return 1;
//        if(playerScore>=500 && playerScore<1000) return 2;
//        if(playerScore>=100 && playerScore<500)return 3;
//        return 4;
//
//

    }

    public static double  calculateInterest(double amount,double interestRate){
        return (amount*(interestRate/100));

    }
}
