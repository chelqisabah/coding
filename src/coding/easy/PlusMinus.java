package coding.easy;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double n = arr.length;
        double positiveElements = Arrays.stream(arr).filter(x -> x> 0).count()/n;
        double negativeElements = Arrays.stream(arr).filter(x -> x < 0).count()/n;

        System.out.printf("%.6f\n", positiveElements );
        System.out.printf("%.6f\n", negativeElements );
        System.out.printf("%.6f", 1 - positiveElements-negativeElements );
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
