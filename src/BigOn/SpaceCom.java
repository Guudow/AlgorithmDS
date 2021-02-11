package BigOn;

public class SpaceCom {
    public void greet(String[] names) {
        // 0(1) space
        String[] copy = new String[names.length];

        for (int i = 0; i < names.length; i++)
            System.out.println("Hi" +  names[i]);

    }
}
