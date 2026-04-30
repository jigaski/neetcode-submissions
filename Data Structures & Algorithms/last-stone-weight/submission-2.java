class Solution {
    public int lastStoneWeight(int[] stones) {
        int numStones = stones.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : stones) {
            maxHeap.add(num);
        }
        while (maxHeap.size() != 1) {
             if (maxHeap.size() == 0) {
                break;
             }
            int currMax = maxHeap.poll();
            int nextMax = maxHeap.poll();
            if (currMax == nextMax) {
                continue;
            } else if (nextMax < currMax) {
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
