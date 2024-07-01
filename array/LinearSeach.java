
public class LinearSeach {

    public static void main(String[] args) {

    // int arr[]= {2,6,88,2,3,9,65,2,4,87,23};
    //     linearSearch(arr, 2, false);
    //    linearSearch(arr, 2, true);
    //     linearSearchMultiple(arr, 2);
    //     finmax(arr);
    //     finmin(arr);

        int my2darr[][] = {
            {21,34,66,7,1},
            {4,6,87,43,2},
            {45,65,90,2,21},
            {12,15,2,3,8}
        };

        // linearSearch2d(my2darr, 2, false);
        // linearSearch2d(my2darr, 2, true);
        // linearSearch2dMultiple(my2darr, 2);

        //findMaxSubArray(my2darr);
        findmx2d(my2darr);
        findmin2d(my2darr);
        
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

    public static void finmax(int arr[]){
        int res = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (res < arr[i]) {
                res = arr[i];
            }
        }
        System.out.println("Maximum Element : " + res);
    }

    public static void finmin(int arr[]){
        int res = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (res > arr[i]) {
                res = arr[i];
            }
        }
        System.out.println("Minimum Element : " + res);
    }

    public static void linearSearch2d(int arr[][], int target, boolean findLast){
        int outerIndex= -1;
        int innerIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            boolean Found = false;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]== target) {
                    outerIndex = i;
                    innerIndex= j;
                    if (findLast == false) {
                        Found = true;
                        break;
                    }
                }
            }
            if (Found) {
                break;
            }
        }
        if (outerIndex == -1 && innerIndex == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Found element at position : " + outerIndex +"," + innerIndex);
        }
    }
    

    public static void linearSearch2dMultiple(int arr[][], int target){
        int size = arr.length * arr[0].length;
        System.out.println(size);
        int ans[][] = new int[size][2];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    ans[k][0]= i;
                    ans[k][1] = j;
                    k++;
                }
            }
        }
        if (k == 0) {
            System.out.println("Element not found");
        } else {
            for (int i = 0; i < k; i++) {
                System.out.println(ans[i][0] + ", " + ans[i][1]);
            }
        }

    }


    public static void findMaxSubArray(int arr[][]){
       int max = Integer.MIN_VALUE;
       int res  = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > max) {
                max =sum;
                res = i;
            }
        }
        System.out.println(max + ","+ res);
    }

    public static void findmx2d (int arr [][]){
        int max = arr[0][0];
        for (int index = 0; index < arr.length; index++) {
            for (int i = 0; i < arr[index].length; i++) {
                if (arr[index][i] > max) {
                    max = arr[index][i];
                }
            }
        }
        System.out.println(max);
    }

    public static void findmin2d (int arr [][]){
        int min = arr[0][0];
        for (int index = 0; index < arr.length; index++) {
            for (int i = 0; i < arr[index].length; i++) {
                if (arr[index][i] < min) {
                    min = arr[index][i];
                }
            }
        }
        System.out.println(min);
    }

}
