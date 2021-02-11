package Arrays;
import java.lang.reflect.Array;


public class InsertArr {
    private int[] items;
    private int count;

    public InsertArr(int length){
        items = new int[length];
    }

    public void inser(int item) {
        // If the array is full, resize it
        if (items.length == count ) {
            // create a new array (twice the size)
            int[] newItems = new int[count * 2];

            // Copy all the existing items
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            // Set "items" to this new array
            items = newItems;
        }
        // add the new item at the end
        items[count++] = item;
    }

    public void removeAt(int index) {
        // validate the index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        // shift he items to the left to fill
        // [10, 30, 40]
        // index: 1
        // 1 <- 2
        // 2 <- 3
        for (int i = index; i < count; i ++)
            items[i] = items[i + 1];
        count --;
    }

    public int indexOf(int item) {
        // if we finde it, return index
        // Otherwise, return -1
        // O(1)
        // O(n)
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

            return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
