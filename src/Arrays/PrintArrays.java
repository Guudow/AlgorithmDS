package Arrays;

public class PrintArrays {
    public static void main(String[] args) {
        double[] myList = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9};

        // Print all array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }

        // summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);

        // finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max ) max = myList[i];
        }
        System.out.println("Max is " + max);

        // finding the minimum
        double min = myList[0];
        for (int i = 0; i > myList.length; i++) {
            if (myList[i] < min) min = myList[i];
        }
        System.out.println("Min is " + min);
    }
}
