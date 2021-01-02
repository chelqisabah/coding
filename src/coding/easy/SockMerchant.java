package coding.easy;

import java.io.*;
import java.util.*;


public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        Arrays.sort(ar);
        int min = ar[0];
        int max = ar[n-1];
        for(int i = min; i<= max; i++)
        {
            int finalI = i;
            long found = Arrays.stream(ar).filter(x -> x == finalI).count();
            if(found%2 == 0)
                result += found/2;
            else
                result += (found -1)/2;
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
