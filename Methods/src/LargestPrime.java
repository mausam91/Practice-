public class LargestPrime {
    public static int getLargestPrime(int a) {
        int x = 0;
        int flag=0;
        int prime=0;
        int max=0;
        if(a<=0) return -1;
        while(a!=0){
            if(a==1)return -1;
            for(int i=2;i<=a;i++){
                if(a%i==0){
                    System.out.println(i+ " factors");
                        if(i==0||i==1) return -1;
                        for(prime=2;prime<=i/2;prime++){
                            if(i%prime==0){
                                //System.out.println(i+"  not prime ");
                                flag=1;


                            }

                        }
                        if(flag==0){
                            //System.out.println(i + " prime");
                            x=i;
                            if(x>max){
                                max=x;
                            }
                        }


                    continue;

                }
                //System.out.println(i);

            }
            break;


        }


        return max;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(1));
    }
}
