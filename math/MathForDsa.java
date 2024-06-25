

 class MathForDsa {

    public static void main(String[] args) {
        //numberEvenOrOdd(6);
       //reverse(2478);
       //exponential(3, 2);
       //countDigits(6879);
       countDigitsByLog(0);
       
    };
    

    static void numberEvenOrOdd (int num) {

        if (num % 2 == 0) {
            System.out.println(num + " Number is even");
        }else{
            System.out.println(num + "  Number is odd");
        }
    };

    static int reverseNumber(int num) {
        int reverse = 0 ;
        while (num>0) {  
            int a =  num % 10;
            reverse = reverse * 10 + a;
            num/=10;
        }
        System.out.println(reverse);
        return reverse;

        
        
    }


    static int reverse (int num){

        int rever = 0;
       while (num > 0) {
        int count = num% 10;
        rever = rever * 10 + count;
        num /=10;
       }
       System.out.println(rever);
        return  rever;
    }

    static double power5 (double num, double power) {
        double res = 1;
        for (int index = 0; index < power; index++) {
            res = res* num;
        }
        System.out.println(res);

        return res ;

    }
 

    static double exponential (double num, double power) {
        double res = 1;
        while ( power > 0) {
            if (num % 2 != 0) {
                res = res *num;
                power = (power -1)/2;
            }
           power /=2;
           num = num * num;
        }
        System.out.println(res);

        return res ;
    }

    public static void countDigits (int num) {
        int counter = 0 ;
        while (num > 0) {
            num /= 10;
            counter ++;
        }
        System.out.println(counter);
    }

    public static void countDigitsByLog(int num){
        int res = 0;
        if (num == 0) {
            System.out.println( 1);
            return ;
        }
      res = (int)Math.log10(num) + 1;
      System.out.println(res);
    }


}
