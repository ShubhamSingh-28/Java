
public class LinearSeach {

    public static void main(String[] args) {

        int arr[]= {2,6,88,2,3,9,65,2,4,87,23};
        //linearSearch(arr, 2, false);
       // linearSearch(arr, 2, true);
        linearSearchMultiple(arr, 2);
        
    }

    public static void linearSearch(int arr[], int target, boolean findLast){
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== target) {
                ans = i;
                if (findLast == false) {
                    break;
                }
            }
        }
        if (ans == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Found element at position : " + ans);
        }
    }

    public static void linearSearchMultiple(int arr[], int target){
        int ans[] = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== target) {
                ans[k] = i;
                k++;
            }
        }
        if (k == 0) {
            System.out.println("Element is not present in array");
        } else {
            for (int i=0; i< k; i++) {   
                System.out.println("Found element at position : " + ans[i]);
            }
        }
    }

    

}
