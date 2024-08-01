public class ExNo2 {
    public static void main(String[] args) {
        int maxNumber = 100;
        System.out.println("Numbers up to " + maxNumber + " that are divisible by both 3 and 5:");
        for (int i = 1; i <= maxNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
