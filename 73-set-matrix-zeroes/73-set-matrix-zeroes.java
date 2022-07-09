class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isall=false;
        Set<Integer> row =new HashSet<Integer>();
        Set<Integer> column =new HashSet<Integer>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    row.add(i);
                    column.add(j);
                }
            }
        }
        if((row.size()==matrix.length)||column.size()==matrix[0].length)
        {
             for(int i=0;i<matrix.length;i++)
          {
               for(int j=0;j<matrix[0].length;j++)
              {
                  matrix[i][j]=0;
              }
           }
        }
        else
        {
            
            for(int i:row )
            {
                for(int j=0;j<matrix[0].length;j++)
                {
                    matrix[i][j]=0;
                }
            }
            for(int j:column )
            {
                for(int i=0;i<matrix.length;i++)
                {
                    matrix[i][j]=0;
                }
            }
            
        }
        
    }
}