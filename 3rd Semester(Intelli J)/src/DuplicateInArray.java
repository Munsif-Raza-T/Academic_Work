import java.util.Arrays;

public class DuplicateInArray
{
    public static void main(String[] args) throws CloneNotSupportedException
    {

        int[] origArray = new int[] { 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8 };


        System.out.println(Arrays.toString(origArray));

        System.out.println(origArray.length);

        int[] tempArray = removeDuplicates(origArray);


        System.out.println(Arrays.toString(tempArray));

        System.out.println(tempArray.length);
    }

    private static int[] removeDuplicates(int[] origArray) {

        int[] tempArray = new int[origArray.length];

        int indexJ = 0;
        for (int indexI = 0; indexI < origArray.length - 1; indexI++)
        {

            if (origArray[indexI] != origArray[indexI+1]) {
                tempArray[indexJ++] = origArray[indexI];
            }
        }

        tempArray[indexJ++] = origArray[origArray.length-1];

        return tempArray;
    }
}