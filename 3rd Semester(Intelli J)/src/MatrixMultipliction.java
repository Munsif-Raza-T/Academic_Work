public class MatrixMultipliction {
    public static int[][] multiplication(int[][] matrix1, int[][] matrix2) {
        int [][] result = new int[matrix1.length][matrix2[0].length];
        if(matrix1.length == matrix2[0].length) {
            for (int i = 0; i < matrix1.length; ++i)
                for (int j = 0; j < matrix2[0].length; ++j)
                    for (int k = 0; k < matrix1[0].length; ++k) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
        }


        return result;
    }


    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,2},
                {3,4},
                {5,6}
        };
        int[][] matrix2 = {
                {7,8,9},
                {10,11,12}
        };
        int[][] multi = multiplication(matrix1,matrix2);

        for(int [] i: multi){
            for(int j: i){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
