
public class Main {
    public static void main(String[] args) {

        int[] radixArray = { 4725, 4586, 1330, 8792, 1594, 5729 };


        for(int i=0; i<radixArray.length; i++) {
            System.out.println(radixArray[i]);

        }
    }

    public static void radixSort(int[] input, int radix, int width) {
        for(int i=0; i<width; i++) {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix) {

        int numItems = input.length;
        int[] countArray = new int[radix];

        for(int value:input) {
            countArray[getDigit(position, value, radix)]++;
        }
    }

}