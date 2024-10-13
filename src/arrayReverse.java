import java.util.Scanner;

public class arrayReverse {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        int start = 0;
        int end = a.length-1;

        System.out.println("Here's the result");
            while (start<end) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
                start++;
                end--;
            }

            for (int element : a){
                System.out.println(element);

        }

    }
}
