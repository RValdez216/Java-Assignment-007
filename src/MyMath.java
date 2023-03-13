import java.util.Scanner;

public class MyMath {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int A = input.nextInt();
        System.out.print("Enter second number: ");
        int B = input.nextInt();
        int gcd = gcf(A, B);
        System.out.println("Greatest Common Factor of " + A + " and " + B + " is: " + gcd);
    }

    public static int gcf(int A, int B) {
        while (B != 0) {
            if (A > B) {
                A = A - B;
            } else {
                B = B - A;
            }
        }
        return A;
    }
}
