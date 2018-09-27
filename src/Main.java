import java.util.*;


public class Main {

    // function to add all numbers and subtract B * 3 from the sum --
    // how close is it even _possible_ in an ideal world to get?

    // for every number in a descending sorted array, check each unfilled bin to see if it fits.
    // Put in first bin with space and remove number from unusedNumbers

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int B = sc.nextInt();
        int N = sc.nextInt();

        ArrayList<Integer> unusedNumbers = new ArrayList<Integer>();

        // add remaining numbers in input to unusedNumbers
        for (int i = 0; i < N; i++) {
            unusedNumbers.add(sc.nextInt());
        }

        // sort resulting array of numbers in reverse order
        Collections.sort(unusedNumbers, Collections.reverseOrder());

        System.out.println("B=" + B + ", N=" + N);
        // check reverse sorting
        System.out.println(unusedNumbers);

        //create 3 empty bins of size B
        ArrayList<Bin> bins = new ArrayList<Bin>();
        for (int i = 0; i < 3; i++){ bins.add(new Bin(B)); }

        // find ideal bin space if everything were to fit perfectly
        int sumOfN = 0;
        for (Integer number : unusedNumbers) {
            sumOfN += number;
        }

        //int idealUnpackedSpace = (B * 3) - sumOfN;

        int remainingUnpackedSum = fillBins(unusedNumbers, bins);
        int remainingUnpackedSpace = 0;
        for (Bin bin : bins) {
            remainingUnpackedSpace += bin.size - bin.currentFill;
        }


        System.out.println("Sum of array: " + sumOfN);
        System.out.println("B * 3: " + B*3);
        //System.out.println("idealUnpackedSpace: " + idealUnpackedSpace);
        System.out.println("Empty space in bins: " + remainingUnpackedSpace);
        System.out.println("Sum of leftover unpacked elements: " + remainingUnpackedSum);
        for (Bin bin : bins){
            System.out.println("bin currentFill: " + bin.currentFill + "/" + bin.size);
        }
    }

    public static int fillBins(ArrayList<Integer> unusedNumbers, ArrayList<Bin> bins) {
        int unusedSum = 0;

        // for every number given
        boolean packed;
        while (!unusedNumbers.isEmpty()) {
            packed = false;

            Integer number = unusedNumbers.get(0);

            // for every number, find first available bin (it's possible to not find any)
            for (int j = 0; j < bins.size(); j++) {

                Bin bin = bins.get(j);

                // if number has not been packed in a bin
                if (!packed && !bin.isFull()) {

                    // if adding number to bin is successful,
                    // remove number from unusedNumbers
                    // and set packed to true
                    if (bin.tryAdd(number)) {
                        unusedNumbers.remove(number);
                        packed = true;
                        System.out.println("Added " + number + " to bin "
                                + j + ". currentFill for bin " + j
                                + " is " + bin.currentFill + "/" + bin.size);
                    }
                    else { System.out.println("Failed to add " + number
                            + " to bin " + j + ". currentFill for bin "
                            + j + " is " + bin.currentFill + "/" + bin.size); }

                    // if bin is full, remove from unfilledBins
                    // so we're not trying to add to it anymore
                    if (bin.isFull()) {
                        System.out.println("Bin " + j + " became full");
                    }
                }

            }
            if (packed == false) {
                unusedSum += number;
                unusedNumbers.remove(number);
                System.out.println("unusedSum had " + number + " added to it. unusedSum = " + unusedSum);
            }
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
