public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0; int mid = 0;
        for(int i = 0; i< matrix.length;i++){
            if(matrix[i][matrix[0].length-1] >= target ){
                row = i;
                break;
            }
        }
        if(row!=Integer.MAX_VALUE){
        int[] a = new int[matrix[row].length];
        for(int i = 0; i<a.length; i++){
            a[i] = matrix[row][i];
        }
        int low = 0;  int high = a.length-1;
        while(high>=low){
            mid = (high+low)/2;
            if(a[mid] == target){
                return true;
            }
                if(a[mid]>target){
                    high = mid -1;
                }
                if(a[mid]<target){
                    low = mid+1;
                }
            }
             return false;
        }
        else{
            return false;
        }
    }
    }
    

