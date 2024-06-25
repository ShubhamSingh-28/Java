
 class MathForDsa {

    public static void main(String[] args) {
        //numberEvenOrOdd(6);
       reverse(2478);
       
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
}
