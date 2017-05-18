package DZ_01_02;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;






public class ConsoleHelper {
    private int size;
    private Scanner in = new Scanner(System.in);





    public void begin() {

        int option = 0;
        getHelloMessage();

        size = getIntFromScanner(in, getErrorMessage());

        ArrayHolder arrayHolder = new ArrayHolder(size);

        arrayHolder.fillArray(arrayHolder.getMas());

        System.out.println("Your initial array is: " + Arrays.toString(arrayHolder.getMas()));

        do {
            getMenu();

            Scanner in = new Scanner(System.in);

            try{
                option = in.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Not a number");
            }



            switch (option) {
                case (1): {
                    System.out.print(writeMessageForElement());
                    int element = in.nextInt();
                    System.out.println("The element " + element + " is found in " + arrayHolder.findElement(element));
                    break;
                }
                case (2): {
                    arrayHolder.sortArrayInAscending();
                    System.out.println(Arrays.toString(arrayHolder.getMas()));
                    break;
                }
                case (3): {
                    arrayHolder.sortArrayInDescending();
                    System.out.println(Arrays.toString(arrayHolder.getMas()));
                    break;
                }
                case (4): {
                    getExitMessage();
                    break;
                }
                default: {
                    System.err.println(getErrorMessage());
                    break;
                }
            }
        } while (option != 4);
    }

    private void getHelloMessage() {
        System.out.println("Enter the size of the array: ");
    }

    private void getExitMessage() {
        System.out.println("Bye-Bye!");
    }

    private String getErrorMessage() {
        return "Invalid value entered";
    }

    private void getMenu() {
        System.out.println("Please type the number of the sort algoritm to use\n1) to find an element;\n2) to sort the array in ascending order;\n3) to sort the array in descending order:\n4) to quit the program");


    }

    private String writeMessageForElement() {
        return "Enter an element you want to find: ";
    }

    private static int getIntFromScanner(Scanner sc, String errorMessage) {
        while (!sc.hasNextInt()) {
            System.err.println(errorMessage);
            sc.next();
        }
        return sc.nextInt();
    }

}
