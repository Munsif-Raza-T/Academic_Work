public class Array{
    public boolean equals(Object[] arr1, Object[] arr2){
        if(arr1.length != arr2.length)
            return false;
        for(int i = 0; i<arr1.length; i++){
            if(!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }

    public float average(int[] arr){
        float avg;
        if(arr.length == 0) return 0;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        avg = sum/arr.length;

        return avg;
    }

    public static int secondLargest(int[] arr){
        int largestIndex=0;
        int secondLargestIndex=0;

        for ( int i = 1; i < arr.length; i++ )
        {
            if ( arr[i] > arr[largestIndex] ) largestIndex = i;
        }

        for ( int i = 1; i < arr.length; i++ )
        {
            if ( arr[i] > arr[secondLargestIndex] && arr[i]<arr[largestIndex] ) secondLargestIndex = i;
        }

        return secondLargestIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1,22,66,35,357,834,555,998,999,97};
        System.out.println(secondLargest(arr));
    }
}