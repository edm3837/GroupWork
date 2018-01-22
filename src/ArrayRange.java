
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class to find the range of an array
 *
 * @author Kieran Sowerby
 */
public class ArrayRange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] range;

        System.out.println("Please enter your array size: ");
        range = new int[input.nextInt()];
        //Creates size of array based on user input
        for (int x = 0; x < range.length; x++) {
            System.out.println("Please enter the elements in the array: ");
            range[x] = input.nextInt();
        }
        Arrays.sort(range);
        System.out.println("Your range is " + range[0] + " - " + range[range.length - 1]);
    }

}
