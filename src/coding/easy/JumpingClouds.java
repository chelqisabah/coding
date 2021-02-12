package coding.easy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingClouds {

    // Complete the jumpingOnClouds function below.

    /**
     *
     * @param c : a table of n integers
     *         2 <= n < 101
     *         c[i] =  0 or 1
     *         c[0]=c[n-1] = 0
     * @return the minimum number of jumps required to win the game
     */
    static int jumpingOnClouds(int[] c) {
        int n = c.length;
        int jumps = 0;
        for (int i = 0; i < n-1; i++) {
            if(i+2 < n && c[i+2] == 0)
            {
                jumps++;
                i++;
            }
            else if(c[i+1] == 0)
                jumps++;
        }


            return jumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
