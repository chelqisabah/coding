package coding.easy;
import java.io.*;
        import java.math.*;
        import java.text.*;
        import java.util.*;
        import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {

        String result = "";
        String[] time = s.substring(0, s.length()-2).split(":");
        String amOrPm = s.substring(s.length()-2);

        if(amOrPm.equals("PM"))
            result += Integer.parseInt(time[0])%12 + 12;
        else if( time[0].equals("12"))
            result += "00";
        else
            result += time[0];

        result += ":" + time[1];
        result += ":" + time[2];
        return result;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
