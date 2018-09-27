import java.util.ArrayList;

public class Bin {
    public int size;
    public int currentFill;

    public Bin(int size){
        this.size = size;
        currentFill = 0;
    }

    public boolean tryAdd(Integer number) {
        boolean addable = (currentFill + number) <= size;
        if (addable) {
            currentFill += number;
        }
        return addable;
    }

    // Check if the bin is full
    public boolean isFull(){
        if(currentFill == size){
            return true;
        }
        else{
            return false;
        }
    }
    // Increment how full the bin is by the number passed in with Avery


    // Fills the bin as much as possible and print it with avery
    public static void fillBin(ArrayList arr, Bin bin) {

            }
        }





