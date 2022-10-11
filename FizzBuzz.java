import static java.lang.Math.round;
public class FizzBuzz {
    public static void main(String[] args) {
        double j;
        double k;
        int i = 1;
        while (i < 100) {
            j = i / 3;
            k = i / 5;
            
            if (j == round(j) && k == round(k)) {
                System.out.println("FizzBuzz");
            } else if (j == round(j)) {
                System.out.println("Fizz");
            } else if (k == round(k)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            
            ++i;
        }
    }
}