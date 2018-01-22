
import java.util.Arrays;
import java.util.Scanner;

/**
 * Program that finds the mode within the array
 *
 * @author Nick Chen
 */
public class ArrayMode {

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        int arraySize;

        System.out.println("Please enter your array size: ");
        arraySize = input.nextInt();
        //Creates size of array based on user input
        double[] array = new double[arraySize];

        arrayInputs(array, arraySize);

        System.out.println("Your mode is " + arrayMode(array, arraySize));
        System.out.println(Arrays.toString(array));
    }

    /**
     * Returns the array and how big it is
     *
     * @param array the array used, of type double
     * @param arraySize the size of the array used
     */
    public static void arrayInputs(double[] array, int arraySize) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter " + arraySize + " variables: ");
        for (int x = 0; x < arraySize; x++) {
            array[x] = input.nextDouble();
        }
    }

    /**
     * Method that finds the mode of an array
     *
     * @param array the array used, of type double
     * @param arraySize the size of the array used
     * @return
     */
    public static double arrayMode(double[] array, double arraySize) {
        double currNum = 0;
        double currNumCount = 0;
        double topNum = 0;
        double topNumCount = 0;
        for (int x = 0; x < arraySize; x++) {
            currNum = array[x];
            for (int y = 0; y < arraySize; y++) {
                if (array[y] == currNum) {
                    currNumCount += 1;
                }
            }
            if (currNumCount > topNumCount) {
                topNum = currNum;
                topNumCount = currNumCount;
            }
            currNumCount = 0;
        }
        return topNum;
    }
}
