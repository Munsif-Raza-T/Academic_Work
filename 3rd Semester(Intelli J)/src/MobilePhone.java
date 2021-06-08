import java.util.Arrays;

public class MobilePhone {
    private String company;
    private String model;

    public MobilePhone(String company, String model) {
        this.company = company;
        this.model = model;
    }

    public static int linearSearch(MobilePhone[] array, String model){
        for(int i = 0; i < array.length; i++){
            if(model == array[i].model)
                return i;
        }

        return -1;
    }

    public static int binarySearch(MobilePhone[] array, String model){
        int leftIndex = 0;
        int rightIndex = array.length;
        int middleIndex;
        Arrays.sort(array);
        while (leftIndex <= rightIndex){
            middleIndex = (leftIndex+rightIndex)/2;
            if(array[middleIndex].equals(model))
                return middleIndex;
            if(array[middleIndex].model.compareTo(model) < 0)
                leftIndex = middleIndex+1;
            if(array[middleIndex].model.compareTo(model) > 0)
                rightIndex = middleIndex-1;
        }

        return -1;
    }

    public static void main(String[] args) {
        MobilePhone[] mobiles = {
                new MobilePhone("OPPO","A37"),
                new MobilePhone("OPPO","F15"),
                new MobilePhone("realme","6"),
                new MobilePhone("I-Phone","11")

        };

        System.out.println("Model is at position: "+linearSearch(mobiles,"11"));
        System.out.println("Model is at position: "+linearSearch(mobiles,"F15"));
    }
}
