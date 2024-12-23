// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int arr[] = {1,2,3,4,5,67,4343,43,};
        int target=2;
        int low=0;
        int high=arr.length-1;
        
        while(low<high) {
            int mid = low + (high - low) / 2;
            
             if (arr[mid] == target) {
                System.out.println("The target is matched and the target is at index " + mid);
                return;
            } else if (arr[mid] > target) { 
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }
}