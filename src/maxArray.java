public class maxArray {
    public static void main(String[] args) {
        int[] arr = {15,22,37,44,18};
        int index = 0;
        int large = arr[index];
        while(index<arr.length){
            if (large<arr[index]) {
                large = arr[index];
            }
                index++;
        }
        System.out.println(large);
    }
}
