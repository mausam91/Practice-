public class SwitchIsLeapYear {



//   if (year>1 && year<9999){
//       int leapYear=year%4;
//       if((leapYear !=0) || (leapYear % 100 != 0) ||(leapYear % 400 != 0) )return  false;
//       else
//       if(leapYear ==0) return true ;
//   }
//   return  false;
        public static boolean isLeapYear(int year) {

            if (year >= 1 && year <= 9999) {
                if (year % 4 == 0) {
                    if (year % 100 != 0 || year % 400 == 0) {
                        return true;
                    }
                }
            }
            return false;
        }



    public  static int getDaysInMonth(int month,int year){
        if (year < 1 || year > 9999) {
            return -1;
        }
        switch (month){
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else return 28;

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return -1;

        }
        }


}
