import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by victorpetrov on 13.04.17.
 */
public class dz02 {
    public static void main(String[] args) throws Exception {
        /* Trotchenko
           Создать консольное приложение, которое просит пользователя ввести из консоли 5 чисел
Все числа должны быть записаны в массив целых чисел.
После этого, массив должен быть отсортирован по возрастанию и выведен консоль.
Сначала начальная версия, далее - отсортированная.

Пример:

Enter number 1:
5
Enter number 2:
4
Enter number 3:
3
Enter number 4:
2
Enter number 5:
1

Initial array: 5, 4, 3, 2, 1
Sorted array: 1, 2, 3, 4, 5.

        */

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

