
public class Main {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(linerSearch(intArray, -15));
        System.out.println(linerSearch(intArray, 1));
        System.out.println(linerSearch(intArray, 888));
        System.out.println(linerSearch(intArray, -22));
    }

    public static int linerSearch(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) {
                return i;
            }
        }
        return -1;
    }

}