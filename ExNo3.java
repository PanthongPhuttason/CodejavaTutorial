public class ExNo3 {
    public static void main(String[] args) {
        int factor = 8;
        System.out.println("Multiplication table for " + factor + ":");
        for (int i = 1; i <= 12; i++) {
            int result = factor * i;
            System.out.println(factor + " x " + i + " = " + result);
        }
    }
}
