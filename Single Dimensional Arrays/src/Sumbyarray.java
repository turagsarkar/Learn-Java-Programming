public class Sumbyarray {
    public static void sum(){
        int[] number = {4, 5, 6, 7, 8};//(Initializing arrays with random values)
        int sum = 0 ;

        for (int i = 0; i < number.length; i++) {
            sum+=number[i];
        }
        System.out.println(sum);

    }
}
