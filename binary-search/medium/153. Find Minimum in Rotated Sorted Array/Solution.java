class Solution {
    public int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high){
            int mid = (low + high) >> 1;

            if(arr[low] <= arr[mid] && arr[mid] >= arr[high]){
                min = Math.min(min, arr[low]);
                low = mid + 1;
            } else {
                min = Math.min(min, arr[mid]);
                high = mid - 1;
            }
        }

        return min;
    }
}
