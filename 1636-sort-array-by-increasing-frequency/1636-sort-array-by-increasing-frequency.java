class Solution 
{
    public int[] frequencySort(int[] nums) 
    {
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Create a priority queue to sort the elements by frequency and value
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[1] == b[1]) {
                return b[0] - a[0]; // Sort by value in decreasing order if frequencies are the same
            } else {
                return a[1] - b[1]; // Sort by frequency in increasing order
            }
        });
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            pq.offer(new int[]{entry.getKey(), entry.getValue()});
        }
        
        // Step 3: Build the result array based on the priority queue
        int[] result = new int[nums.length];
        int index = 0;
        while (!pq.isEmpty()) {
            int[] element = pq.poll();
            int value = element[0];
            int frequency = element[1];
            for (int i = 0; i < frequency; i++) {
                result[index++] = value;
            }
        }
        
        return result;

    }
}