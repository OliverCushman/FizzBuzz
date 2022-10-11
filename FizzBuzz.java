public class FizzBuzz {
    public static void main(String[] args) {
        double j;
        double k;
        
        for (int i = 1; i <= 100; i++) {
            j = (double) i / 3;
            k = (double) i / 5;
            
            if (j == (int) j && k == (int)k) {
                System.out.println("FizzBuzz");
            } else if (j == (int) j) {
                System.out.println("Fizz");
            } else if (k == (int) k) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}