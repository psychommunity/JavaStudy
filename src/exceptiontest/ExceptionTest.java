package exceptiontest;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author DAHLIA 13-04-02
 */
public class ExceptionTest {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[2];
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input : ");
            try {
                arr[i] = sc.nextInt();
            } catch (InputMismatchException e) {
                //e.printStackTrace();
                System.err.println("InputMismatchException..");
                System.exit(1);
            }
        }
        System.out.println();
        try {
            result = arr[0] / arr[1];
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException..");
        }
        System.out.println("result : " + result);
    }
}
