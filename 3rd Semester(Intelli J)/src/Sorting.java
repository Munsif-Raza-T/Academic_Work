public class Sorting {
    public static void bubbleSort(int[] array){
        for(int i = 1; i<array.length; i++){
            for(int j = 0; j < i; j++){
                if(array[j] > array[i]){
                    array[j] = array[j] + array[i];
                    array[i] = array[j] - array[i];
                    array[j] = array[j] - array[i];
                }
            }
        }
    }

    public static void insertionSort(int[] array){
        int temp = 0;
        for(int i = 1; i < array.length; i++){
            temp = array[i];
            for(int j = i-1; j >= 0; j--){
                if(temp > array[j]){
                    array[j+1] = temp;
                    break;
                }
                if(temp < array[j]){
                    array[j+1] = array[j];
                }
                if(j == 0){
                    array[j] = temp;
                }
            }

        }
    }

    public static void bubbleSortDesc(int[] array){
        for(int i = 1; i<array.length; i++){
            for(int j = 0; j < i; j++){
                if(array[j] < array[i]){
                    array[j] = array[j] + array[i];
                    array[i] = array[j] - array[i];
                    array[j] = array[j] - array[i];
                }
            }
        }
    }

    public static void insertionSortDesc(int[] array){
        int temp = 0;
        for(int i = 1; i < array.length; i++){
            temp = array[i];
            for(int j = i-1; j >= 0; j--){
                if(temp < array[j]){
                    array[j+1] = temp;
                    break;
                }
                if(temp > array[j]){
                    array[j+1] = array[j];
                }
                if(j == 0){
                    array[j] = temp;
                }
            }

        }
    }

    public static void print(int[] array){
        System.out.print("[");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ",");
        }
        System.out.println("]");
    }

    public static void insertionSortNew(int[] array){
        int temp = 0;
        for(int i = 1; i < array.length; i++){
            temp = array[i];
            int j = i-1;
            while (j > -1 && temp <= array[j]){
                array[j+1] = array[j];
                --j;
            }
            array[j+1] = temp;
        }
    }

    public static int partition(int[] arr, int start, int end){
        int pivot = arr[start];
        int i = start , j = end;
        while (i<j){
            while (j>i && arr[--j] >= pivot);
            if(j > i) arr[i] = arr[j];
            while (i<j && arr[++i] <= pivot);
            if(i < j) arr[j] = arr[i];
        }
        arr[j] = pivot;
        return j;
    }

    public static void quickSort(int[] array, int start, int end){
        if(end - start < 2) return;
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot);
        quickSort(array, pivot+1, end);
    }

    public static void main(String[] args) {
       /* long startTime;
        long endTime;
        int [] array = new int[100000];
        for(int i = 0; i < array.length; i++){
            array[i] = array.length-i;
        }
        startTime = System.currentTimeMillis();
        bubbleSort(array);
        endTime = System.currentTimeMillis();
        System.out.println("Time Taken by Bubble sort is: "+ (endTime-startTime));

        startTime = System.currentTimeMillis();
        insertionSort(array);
        endTime = System.currentTimeMillis();
        System.out.println("Time Taken by Insertion sort is: "+ (endTime-startTime));*/

        int[] arr = {54,8,3,77,53,878,45,24,75,456,7653,564,335,99};
        print(arr);
        quickSort(arr, 0, arr.length);
        print(arr);
    }
}
