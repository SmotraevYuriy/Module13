package medium2;

public class StackOverFlow {
    public static void main(String[] args) {

        try {
            print();
        } catch (StackOverflowError e) {
            System.err.println("Пойман StackOverflowError: " + e.getMessage());
        }
    }

    private static void print() {
        print();
    }
}
