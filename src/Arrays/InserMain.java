package Arrays;

public class InserMain {
    public static void main(String[] args) {
        InsertArr numbers = new InsertArr(3);
        numbers.inser(10);
        numbers.inser(20);
        numbers.inser(30);
        numbers.inser(40);
        System.out.println(numbers.indexOf(50));
        numbers.print();
    }
}
