
import java.util.Arrays;
import java.util.Scanner;

public class ArrayAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] average;
        int arraySize;

        System.out.println("Please enter your array size: ");
        arraySize = input.nextInt();
        //Creates size of array based on user input
        average = new double[arraySize];

        arrayInputs(average, arraySize);

        System.out.println("Your average is " + arrayAverage(average, arraySize));
        System.out.println(Arrays.toString(average));
    }

    //Inputs variables into array
    public static void arrayInputs(double[] array, int arraySize) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter " + arraySize + " variables: ");
        for (int x = 0; x < arraySize; x++) {
            array[x] = input.nextDouble();
        }
        arrayAverage(array, arraySize);
    }

    //Finds average of array
    public static double arrayAverage(double[] array, double arraySize) {
        double averages = 0;
        for (int x = 0; x < arraySize; x++) {
            averages += array[x];
        }
        averages = (averages / arraySize);
        return averages;
    }
}
