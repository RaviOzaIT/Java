// www.raviroza.com
// 29-Jan-22, Saturday (6.07 pm)
class ArrayMultiDimensional
{
    public static void main(String a[])
    {
        // array declaration without size
        int marks[][];
        // array dimension, row and column
        int r = 5, c = 3;
                
        // allocation of memory
        marks = new int[r][c];    

        // for loop to assign values to jagged array
        for (int i=0; i<marks.length; i++)
        {
            for(int j=0; j<marks[i].length; j++)
            {
                marks[i][j] = i+j+1;
            }            
        }

        // for each loop to retrieve values from jagged array
        for (int[] x : marks) 
        {
            for (int j : x) {            
                System.out.print(j + " ");       
            }   
            System.out.println();
        }

    }
}