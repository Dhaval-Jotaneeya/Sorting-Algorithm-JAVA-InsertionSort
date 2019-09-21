

class Insertion
{
    int[] InsertionSorting(int Array[], int l)
    {
        for (int i = 1; i < l; i++) 
        {
            int backupValue = Array[i];
            int holeIndex = i;
            while ( (Array[holeIndex-1] > backupValue) && holeIndex > 0 ) 
            {
                Array[holeIndex] = Array[holeIndex-1];
                holeIndex--;
            }
            Array[holeIndex] = backupValue;
        }
        return Array;
    }
}

/**
 * InsertionSort
 */
public class InsertionSort {

    public static void main(String[] args) {
        
        int unsortedArray[] = {1,5,9,6,4,8,7,3,2};
        int l = unsortedArray.length;
        Insertion I1 = new Insertion();
        long startTime = System.nanoTime();
        int sortedArray[] = I1.InsertionSorting(unsortedArray, l);
        long endTime = System.nanoTime();

        for (int i = 0; i < l ; i++) {
            System.out.println(sortedArray[i]);
        }
        System.out.println("Total Time in Neno Second: "+ (endTime-startTime));

    }
}