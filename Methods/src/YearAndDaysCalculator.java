public class YearAndDaysCalculator {
   public static void printYearsAndDays(long minutes){
       if (minutes<0){ System.out.println("Invalid Value");}
       else{
           long hours= minutes/60;
           long remainingMinutes=minutes%60;
           long days=hours/24;
           long remainingHours=hours%24;
           long  year=days/365;
           long remainingDays= days%365;
           System.out.println(minutes+" min = "+year+" y and "+remainingDays+" d");
       }
   }
}
