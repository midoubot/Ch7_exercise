import java.util.Arrays;
public class Ch_7_Exercise{

    public static void main(String[] args) {

        int[] numbers = {2, 9, 4, 8};
        String numString;
        int temp = 0;

        for (int i = 0; i<numbers.length - 1; i++){

            for (int n = 0; n<numbers.length - 1; n++){
                if (numbers[i] > numbers[n]){
                    temp = numbers[n + 1];
                    numbers[n + 1] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
            numString = Arrays.toString(numbers);
        System.out.println(numString);
        }
    }