public class Result1To100 {
    public static void main(String[] args) {
        int sum =0;
        int i = 1;

        while (i <= 100) {
            System.out.println(+i);
            sum += i;
            i++;
        }
        System.out.println("sum of numbers 1-100 : "+sum);
    }
}
