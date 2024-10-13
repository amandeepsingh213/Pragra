import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int[] array = new int[];
        System.out.println("Enter the student numbers");
        int[] array = new int[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }


    }
}
