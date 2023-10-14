public class Shifting {
    public static void main(String[] args) {
        int[] number= {1,2,3,4,5};
        int first = number[0];
        for(int i = 0 ; i< number.length-1;i++){
            number[i]=number[i+1];
        }
        number[number.length-1]=first;
        for (int i = 0 ; i < number.length;i++ ){
            System.out.println(number[i]);
        }
    }
}
