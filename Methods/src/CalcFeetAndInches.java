public class CalcFeetAndInches {

    public static double calcFeetAndInchesToCentimeter(double feet,double inches){
        if ((feet>=0) || (inches>0 || inches<=12)){

        double centimeter=(feet*12)*2.54;
        centimeter+=(inches*2.54);

        return centimeter;

        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeter(double inches){
        if(inches>=0){
            double feet=(int)inches/12;
            double remainingInches= (int) inches%12;
          return   calcFeetAndInchesToCentimeter(feet,remainingInches);


        }
        return -1;
    }
}
