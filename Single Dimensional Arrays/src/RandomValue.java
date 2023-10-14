import java.util.Random;

public class RandomValue {
    public static void rand() {
        int[]arr = {1,2,3,4};
        Random a = new Random();
        for ( int i = 0 ; i< arr.length;i++){
            int random = a.nextInt(arr.length);
            int temp = arr[i];
            arr[i]=arr[random];
            arr[random]=temp;
            System.out.print(temp + " ");
        }
    }
}
