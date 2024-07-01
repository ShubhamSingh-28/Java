public class BinarySearch {

    public static void main(String[] args) {

        int arr[] = {2,3,5,6,8,12,74};
        //binarySearch(arr,12);

        int arr2[] = {88,82,77,71,41,39,23,2};
       // binarySearchdecrease(arr2, 77);

        binarySearchOrderAgnotic(arr, 12);
        binarySearchOrderAgnotic(arr2, 77);
    }

    public static void binarySearch(int arr[], int target){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start+ (end - start)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid +1;
            }else{
                end = mid -1;
            }
        }

        if (ans == -1) {
            System.out.println("Element not found in Array");
        } else{
            System.out.println("Element found at index " + ans);
        }
       
    }

    public static void binarySearchdecrease(int arr[], int target){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start+ (end - start)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            } else if (arr[mid] > target) {
                start = mid+1;
            } else{
                end = mid -1;
            }
        }
        if (ans == -1) {
            System.out.println("Element not found in Array");
        } else{
            System.out.println("Element found at index " + ans);
        }
    }

    public static void binarySearchOrderAgnotic (int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] <= arr[end]) {
            binarySearch(arr, target);
        } else {
           binarySearchdecrease(arr,target);
        }
       
    }

}