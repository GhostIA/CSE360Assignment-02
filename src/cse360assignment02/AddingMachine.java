package cse360assignment02;
// Repository: https://github.com/GhostIA/CSE360Assignment-02
public class AddingMachine {
    private int total;
    private String current;

    public AddingMachine () {
        current = "0";
        total = 0;  // not needed - included for clarity
        /**
         * Creates values
         */
    }

    public int getTotal () {
        return total;
        /***
         * @return total
         */
    }

    public void add (int value) {
        total += value;
        current = current + " + " + Integer.toString(value);
        /***
         * @param value adds to total
         */
    }

    public void subtract (int value) {
        total =- value;
        current = current + " - " + Integer.toString(value);
        /***
         * @param value subtracts from total
         */
    }

    public String toString () {
        return current;
        /***
         * @return current
         */
    }

    public void clear() {
        current = "0";
        total = 0;
        /**
         * clears all values
         */
    }
}
