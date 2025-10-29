package medium2;

import java.util.ArrayList;

public class OutOfMemory {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();
        try {
            while (true) {
                byte[] arr = new byte[100_000_000];
                list.add(arr);
            }
        } catch (OutOfMemoryError e) {
            System.err.println("Пойман OutOfMemoryError: " + e.getMessage());
        }

    }

}
