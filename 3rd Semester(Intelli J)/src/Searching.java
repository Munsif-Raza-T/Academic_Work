import java.util.Arrays;

public class Searching {

    public static int linearSearch(Object[] array, Object data){
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(data))
                return i;
        }
        return -1;
    }

    public static int binarySearch(Object[] array, Object data){
        int leftIndex = 0;
        int rightIndex = array.length-1;
        int middleIndex;
        Arrays.sort(array);

        while (leftIndex <= rightIndex){
            middleIndex = (leftIndex + rightIndex)/2;
            if(((String) array[middleIndex]).compareTo((String)data) == 0 )
                return middleIndex;
            if(((String) array[middleIndex]).compareTo((String)data) > 0 )
                rightIndex = middleIndex-1;
            if(((String) array[middleIndex]).compareTo((String)data) < 0 )
                leftIndex = middleIndex+1;
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] array = {
                "Munsif",
                "Raza",
                "Thebo"
        };

        System.out.println("Data is at position: "+ linearSearch(array, "Th"));
        System.out.println("Data is at position: "+ binarySearch(array, "Thebo"));
    }
}
