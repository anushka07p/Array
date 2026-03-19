public class CountOccurrence {
    public static int count(int[] arr, int target) {
        int count = 0;

        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2};
        int target = 2;

        System.out.println(count(arr, target)); // Output: 3
    }
}
