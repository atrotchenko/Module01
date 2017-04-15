import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by victorpetrov on 13.04.17.
 */
public class dz2 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number 1: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Enter number 2: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Enter number 3: ");
        int c = Integer.parseInt(reader.readLine());
        System.out.println("Enter number 4: ");
        int d = Integer.parseInt(reader.readLine());
        System.out.println("Enter number 5:");
        int e = Integer.parseInt(reader.readLine());

        int [] arr = {a,b,c,d,e};

        System.out.println("Initial array: " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.print("Sorted array: ");


        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.print(arr[3] + " ");
        System.out.print(arr[4] + " ");
    }


    }

