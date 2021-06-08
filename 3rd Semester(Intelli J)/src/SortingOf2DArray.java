import java.util.Arrays;

public class SortingOf2DArray {
    public static void main(String[] args) {
        int[][] array = {
                {1,3,5,8},
                {12,7,9,10},
                {13,54,76,90},
                {77,99,22,55}
        };

        print(array);

        sort(array);

        System.out.println();

        print(array);


    }

    public static void sort(int[][] array){
        int[] temp = new int[array.length*array.length];
        int index = 0;
        for(int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                temp[index]= array[i][j];
                index++;
            }
        }
        index=0;
        Arrays.sort(temp);
        for(int i=0; i<array.length; i++){
            for(int j= 0; j<array.length; j++){
                array[i][j]=temp[index];
                index++;
            }
        }

    }

    public static void print(int[][] array){
        for(int[] i: array){
            for(int j: i){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
