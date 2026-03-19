public class MissingNumber {
    public static int findMissing(int[] arr) {
        int n = arr.length;

        int totalSum = n * (n + 1) / 2;  // expected sum
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return totalSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};

        System.out.println(findMissing(arr)); // Output: 2
    }
}
