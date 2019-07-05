public class IsEvenNumber {
    //While and Do While statement

    public static boolean isEvenNumber(int n){
        if(n%2==0){
            return true;
        }
        return  false;
    }

    public static void main(String[] args) {
        int startnum =0 ;
        int endnum =30;
        int count=0;
        while (startnum <=endnum){
            startnum++;


            if(!isEvenNumber(startnum)){

               // System.out.println(startnum);
                continue;
            }
            count++;

           System.out.println(startnum);
            if(count>5) break;
            //System.out.println(count);


        }
        System.out.println(count);
    }
}
