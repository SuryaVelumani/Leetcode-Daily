class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int max = 0;
        int len = img1.length;
        for(int index = 0; index < len; index++)
        {
            for(int jindex = 0; jindex < len; jindex++)
            {
                max = Math.max(max, rightDownFunction(img1, img2, jindex, index, len));
                max = Math.max(max, rightDownFunction(img2, img1, jindex, index, len));
                max = Math.max(max, rightUpFunction(img1, img2, jindex, index, len));
                max = Math.max(max, rightUpFunction(img2, img1, jindex, index, len));
            }
        }
        return max;
    }
    public static int rightDownFunction(int a[][], int b[][], int jindex, int index, int len)
    {
        int count = 0;
        for(int i = index; i < len; i++)
        {
            for(int j = jindex; j < len; j++)
            {
                if(a[i][j] == 1 && b[i - index][j - jindex] == 1)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static int rightUpFunction(int a[][], int b[][], int jindex, int index, int len)
    {
        int count = 0;
        for(int i = index; i < len; i++)
        {
            for(int j = 0; j < len - jindex; j++)
            {
                if(a[i][j] == 1 && b[i - index][j + jindex] == 1)
                {
                    count++;
                }
            }
        }
        return count;
    }
    
}
