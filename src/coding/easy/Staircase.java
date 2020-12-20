package coding.easy;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {

        for(int i = 1; i <=n; i++)
        {
           String line = String.join("", Collections.nCopies(n-i, " "));
           line += String.join("", Collections.nCopies(i, "#"));
            System.out.println(line);
        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
