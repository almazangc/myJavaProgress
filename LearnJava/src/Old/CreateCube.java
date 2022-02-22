package Old;

import java.util.Arrays;

class CreateCube {
  
    public static void main(String[] args) {
      for (int[][] x : createCube()) {
        for (int[] y : x) {
          for (int z : y) {
            System.out.print(z + ' '); 
          }
            System.out.print(',');
        }
        System.out.println();
      }
    }
  
    public static int[][][] createCube() {
        // write your code here
        int[][][] arr = new int[3][3][3]; 
        
        for (int i = 0; i < 3; i++) {            
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    arr[i][j][k] = k + (arr.length * j);
                }
            }
        }
        return arr;
    }
}
