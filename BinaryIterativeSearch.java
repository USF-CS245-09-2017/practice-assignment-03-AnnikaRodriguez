public class BinaryIterativeSearch implements Practice03Search {

    public String searchName(){

        return "Binary Iterative Search" ;
    }

    public int search(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while (start < end){

            int mid = (start + end) / 2 ;

            if (arr[mid] == target){
                return mid;
            }

            else if (arr[mid] > target) {
                end = mid - 1;
            }

            else{
                start = mid + 1 ;
            }

        }
        return - 1 ; //only if target is not found in array
    }


}
