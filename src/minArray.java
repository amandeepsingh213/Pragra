import java.util.Scanner;
public class minArray {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        for (int i = 0; i < a.length; i++) {
            a[i] =scanner.nextInt();
        }
        int index = 0;
        int min = a[index];
        while (index<a.length){
            if (min>a[index]){
                min = a[index];
            }
            index++;
        }
        System.out.println("The minimum number from the given numbers is : " + min);
    }

}
