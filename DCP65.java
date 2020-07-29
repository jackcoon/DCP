public class DCP65 {

    public static void main(String[] args) {
        int [][] a = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };

        int lastRow = a.length;
        int lastCol = a[0].length;
        int i, firstRow = 0, firstCol = 0; 
        
        while (firstRow < lastRow && firstCol < lastCol) { 
        
            // left -> right of remaining rows
            for (i = firstCol; i < lastCol; ++i) { 
                System.out.print(a[firstRow][i] + " "); 
            } 
            firstRow++;
    
            System.out.print("\n");
            
            // Bottom -> top of Remaining Columns 
            for (i = firstRow; i < lastRow; ++i) { 
                System.out.print(a[i][lastCol - 1] + " "); 
            } 
            lastCol--;
            
            System.out.print("\n");
                        
            //Right -> left of Remaining Rows
            if(firstRow < lastRow){
                for (i = lastCol - 1; i >= firstCol; i--) { 
                    System.out.print(a[lastRow - 1][i] + " "); 
                }
                lastRow--;
            }
            
            System.out.print("\n");
            
            //Bottom -> Top of Remaining Columns
            if(firstCol < lastCol){
                for (i = lastRow - 1; i >= firstRow; i--) { 
                    System.out.print(a[i][firstCol] + " "); 
                }
                firstCol++;
            }
            
            System.out.print("\n");
        } 
    }
}
