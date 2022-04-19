import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            int [] numbers = {5,4,3,2,1};
            int num;
            int i=0;
            for( i=0; i< numbers.length-1;i++){
                num=numbers[i]*numbers[i+1];
                System.out.println(num);
            }
            //System.out.println(numbers[i]*numbers[0]);
            do{
                System.out.println(numbers[i]*numbers[0]);
            }while(i>numbers.length);

            // Teacher solution

            System.out.println("input: " + Arrays.toString(numbers));
            int lastPosition = numbers[numbers.length - 1] * numbers[0];
            for(i = 0; i < numbers.length -1; i++){
                numbers[i] = numbers[i] * numbers[i + 1];
            }
            numbers[numbers.length - 1] = lastPosition;
            System.out.println("output: " + Arrays.toString(numbers));
        }

}
