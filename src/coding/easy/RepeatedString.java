package coding.easy;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long count = 0L;
        int len = s.length();
        if(n < len)
        {
            count = s.substring(0,(int)n).chars().filter( x -> x == 'a').count();
        }
        else
        {
            long aCount= s.chars().filter( x -> x == 'a').count();
            count = (n/len)*aCount;
            if(count > 0)
            {
                long k = n%len;
                if(s.indexOf('a') < k)
                    count += s.substring(0,(int)k).chars().filter( x -> x == 'a').count();
            }
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
