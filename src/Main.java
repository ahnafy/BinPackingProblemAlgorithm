import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        //populate mainArray and print it.
        populateArr(scan, arrayOfNumbers, length);
        sortArr(arrayOfNumbers);


        //create 3 empty bins of size 5
        bin bin1 = new bin(binSize);
        bin bin2 = new bin(binSize);
        bin bin3 = new bin(binSize);

        System.out.print("Bin 1: ");
        bin.fillBin(arrayOfNumbers, bin1);

        System.out.print("Bin 2: ");
        bin.fillBin(arrayOfNumbers, bin2);

        System.out.print("Bin 3: ");
        bin.fillBin(arrayOfNumbers, bin3);

        printRemainders(arrayOfNumbers);
        addRemainders(arrayOfNumbers);


        scan.close();


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

    }


}
