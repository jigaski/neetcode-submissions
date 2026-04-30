class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : stones) {
            maxHeap.add(num);
        }
        while (maxHeap.size() > 1) {
            int currMax = maxHeap.poll();
            int nextMax = maxHeap.poll();
            if (nextMax < currMax) {
                currMax = currMax - nextMax;
                maxHeap.add(currMax);
            }
        }
        if (maxHeap.size() == 1) {
            return maxHeap.poll();
        } else {
            return 0;
        }
    }
}
