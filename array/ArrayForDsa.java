import java.util.Scanner;

public class ArrayForDsa {
    public static void main(String[] args) {
      //int hed = 67;
      //System.out.println(hed);
      
      /* int age[]; //declaration
        age= new int[5];  // allocation

        int age[] = new int[7];
        
       int marks[]= {8,10,34,49,5,4};

       for (int index = 0; index < marks.length; index++) {
        System.out.println(marks[index]);;
       }
        

       for (int i : marks) {
        int b = i*3;
       System.out.println(b);
      }

      String names[]={"Ram","Shyam","Gopal"};
      
      for (String string : names) {
        System.out.println(string);
      }
         */ 
        /* 
         int rollNo[] = new int[5];
         rollNo[0] = 54;
        
         
        String b= sc.nextLine();
        System.out.println(b);
        sc.close();
        */
       // System.err.println("Error");

      /*  int arr[]= {2,9,8,74,32};
       print(arr);
        deletion(arr, 3);
        System.out.println("After Deletion");
        print(arr);
*/
Scanner sc = new Scanner(System.in);
        int m2darray[][] = new int[3][3];

        for (int i = 0; i < m2darray.length; i++) {
          for (int j = 0; j < m2darray[i].length; j++) {
            System.out.println("Enter "+j+" element");
            int element = sc.nextInt();
            m2darray[i][j] = element;
          }
        }
        sc.close();
        print2d(m2darray);
        
    }


    public static void print(int arr[]){
      for (int i : arr) {
        System.out.print(i +",");
      }
    }


    public static void insert (int arr[], int pos, int element){
        int size = arr.length;

        if (pos<0 || pos> size -1) {
          System.err.println("Wrong Position !");
          return;
        }

        for (int i = size-2; i >=pos; i--) {
          arr[i+1] = arr[i];
        }
        arr[pos]= element;

    }

    public static void Insertion(int arr[], int pos, int element){
      int size = arr.length;
      System.out.println(size);
        if (pos<0 || pos> size -1) {
          System.err.println("Wrong Position !");
          return;
        }

        for (int i = size-2; i >= pos; i--) {
          arr[i+1] =arr[i];         
        }
        arr[pos] = element;
    }


    public static void deletion(int arr[], int pos){
      int size = arr.length;

        if (pos<0 || pos> size -1) {
          System.err.println("Wrong Position !");
          return;
        }

        for (int i = pos; i <=size-2; i++) {
          arr[i]=arr[i+1];
        }
        arr[size-1] =0;
    }


    public static void print2d(int arr[][]){
     
      for (int[] is : arr) {
        print(is);
      }
    }

}
