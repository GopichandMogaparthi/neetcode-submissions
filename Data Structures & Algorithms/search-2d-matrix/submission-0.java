class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[] result = new int[m*n];

        int index = 0;

        for(int i =0;i<m;i++){

            for(int j=0;j<n;j++){
                result[index++] = matrix[i][j];
            }
        }
        return binarySearch(result, target);
        
    }

    public boolean binarySearch(int[] result, int target){

        int low =0 ,high = result.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(result[mid]==target){
                return true;
            }
            if(result[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}
