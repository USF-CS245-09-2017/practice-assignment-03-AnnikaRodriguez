public class BinaryRecursiveSearch implements Practice03Search {

    public String searchName(){

        return "Binary Recursive Search" ;
    }
    public int search(int [] arr, int target) {

        return binaryRecursive(arr, target, 0,  arr.length - 1);

    }

    public int binaryRecursive(int [] arr, int target, int start, int end){

        if (end < start){
            return - 1;
        }
        int mid = (start + end) / 2 ;


        if (arr[mid] == target){
            return mid;
        }

        else if(target < arr[mid]){

            return binaryRecursive(arr, target, 0, mid -1);
        }

        else {

            return binaryRecursive(arr, target, mid + 1, arr.length - 1);
        }


    }


}
