import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;


public class dz02v102 {


    public static void main(String[] args) throws IOException {
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
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");
            String s = reader.readLine();
            arr[i] = Integer.parseInt(s);
        }

        System.out.print("Initial array: ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(" " + arr[i]);
        System.out.println();


        int a, b, t;

        for (a = 1; a < arr.length; a++)
            for (b = arr.length - 1; b >= a; b--) {
                if (arr[b - 1] > arr[b]) {

                    t = arr[b - 1];
                    arr[b - 1] = arr[b];
                    arr[b] = t;


                }
            }

        System.out.print("Sorted array: ");
        for(int i = 0; i < arr.length; i ++)
            System.out.print(" " + arr[i]);
        System.out.println();
    }
}

