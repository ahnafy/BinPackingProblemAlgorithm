import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Main {

    // function to add all numbers and subtract B * 3 from the sum --
    // how close is it even _possible_ in an ideal world to get?

    // for every number in a descending sorted array, check each unfilled bin to see if it fits.
    // Put in first bin with space and remove number from unusedNumbers

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int B = 0;
        int N = 0;
        ArrayList<Integer> unusedNumbers = new ArrayList<Integer>();

        //create 3 empty bins of size 5
        ArrayList<Bin> unfilledBins = new ArrayList<Bin>();
        for (int i = 0; i < 3; i++){
            unfilledBins.add(new Bin(B));
        }

    }

    public static int fillBins(ArrayList<Integer> unusedNumbers, ArrayList<Bin> unfilledBins) {
        int unusedSum = 0;

        // for every number given
        boolean packed;
        for (Integer number : unusedNumbers) {
            packed = false;

            // check if number fits in each bin
            for (Bin bin : unfilledBins) {

                // if number not already added to a bin and
                // adding number to bin is successful,
                // remove number from unusedNumbers
                if (!packed && bin.tryAdd(number)) {
                    unusedNumbers.remove(number);
                    packed = true;
                }

                // if bin is full, remove from unfilledBins
                if (bin.isFull()) {
                    unfilledBins.remove(bin);
                }
            }
            if (packed = false) { unusedSum += number; }
        }
        return unusedSum;
    }

    // Add remainders up and print an integer
    private static void addRemainders(ArrayList arrayOfNumbers) {
        int total = 0;
        for(int i = 0; i < arrayOfNumbers.size(); i++){
            total = total + (int) arrayOfNumbers.get(i);
        }
        System.out.println("Amount of Unused Space: " + total);


    }

    // Print a list of remainders
    private static void printRemainders(ArrayList arrayOfNumbers) {
        System.out.print("List of the Unpacked Items: " + "[");
        for(int i = 0; i < arrayOfNumbers.size(); i++){
            if(i == arrayOfNumbers.size() - 1){
                System.out.print(arrayOfNumbers.get(i));
            }
            else{
                System.out.print(arrayOfNumbers.get(i) + ", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}
