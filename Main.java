import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        //populate mainArray and prints it.
        populateArr(scan, arr, length);
        sortArr(arr);


        //create 3 empty bins of size 5
        bin bin1 = new bin(binSize);
        bin bin2 = new bin(binSize);
        bin bin3 = new bin(binSize);

        System.out.print("Bin 1: ");
        bin.fillBin(arr, bin1);

        System.out.print("Bin 2: ");
        bin.fillBin(arr, bin2);

        System.out.print("Bin 3: ");
        bin.fillBin(arr, bin3);

        printRemainders(arr);
        addRemainders(arr);


        scan.close();


    }
    // Add remainders up and print an integer
    private static void addRemainders(ArrayList arr) {
        int total = 0;
        for(int i = 0; i < arr.size(); i++){
            total = total + (int) arr.get(i);
        }
        System.out.println("Amount of Unused Space: " + total);


    }
    // Print a list of remainders
    private static void printRemainders(ArrayList arr) {
        System.out.print("List of the Unpacked Items: " + "[");
        for(int i = 0; i < arr.size(); i++){
            if(i == arr.size() - 1){
                System.out.print(arr.get(i));
            }
            else{
                System.out.print(arr.get(i) + ", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    // Sorts an array in reverse order
    private static void sortArr(ArrayList arr) {
        Collections.sort(arr, Collections.reverseOrder());

    }

        }

    }


}
