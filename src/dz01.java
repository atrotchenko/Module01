import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dz01 {
    public static void main(String[] args) throws IOException {
    /*    Trotchenko
Создать консольное приложение, которое запрашивает имя пользователя. После ввода имени выводит строку: Hello, <введённое имя>
Пример:

Enter Your name:
Eugene

Hello, Eugene */
        System.out.println("Enter You name: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();


        System.out.println("Hello, " + s);

    }
}
