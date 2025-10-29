package easy;

public class Main {
    public static void main(String[] args) {
        System.out.println(sqrt(4));
        System.out.println(sqrt(-4));
    }

    private static double sqrt(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("число должно быть больше 0");
        } else {
            return Math.sqrt(a);
        }
    }
}


