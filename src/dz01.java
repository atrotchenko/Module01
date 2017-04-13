import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by victorpetrov on 13.04.17.
 */
public class dz01 {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter You name: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();


        System.out.println("Hello, " + s);

    }
}
