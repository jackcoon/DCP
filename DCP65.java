public class DCP65 {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };

        //matrix.length = colums (or number of arrays; 0 -> n-1)
        //matrix[0].length = rows (or number of items in an array 1 -> n)
        //System.out.print(matrix.length);
        //System.out.print(matrix[0].length);
        int col,row;
        int minCol, minRow;
        col = row = 0;
        minCol = minRow = 0;
        col = matrix.length;
        row = matrix[0].length;

//        for(int i = 0; i < matrix.length; i++){
//            for(int j = 0; j < matrix[0].length; j++){
//
//            }
//        }

        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
