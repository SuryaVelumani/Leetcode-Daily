class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int index = 1; index < matrix.length; index++)
        {
            for(int jindex = 0; jindex < matrix[index].length; jindex++)
            {
                if(index - 1 > -1 && jindex - 1 > -1)
                {
                    if(matrix[index-1][jindex-1] != matrix[index][jindex])
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
