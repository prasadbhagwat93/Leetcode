public class Solution {
    public void rotate(int[][] matrix) {
        int[][] co = new int[matrix.length][matrix[0].length];
        for(int i =0; i< matrix.length; i++ ){
            co[i] = Arrays.copyOf(matrix[i],matrix.length);
        }
        
        for(int i=0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length;j++){
                matrix[i][j] = co[matrix.length-1-j][i];
            }
        }
    }
}
