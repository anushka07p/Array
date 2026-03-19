import java.util.HashMap;

public class MostFrequentElement {
    public static int mostFrequent(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int result = -1;

        
        for (int key : map.keySet()) {
            if (map.get(key) > maxCount) {
                maxCount = map.get(key);
                result = key;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 2};

        System.out.println(mostFrequent(arr)); 
    }
}
