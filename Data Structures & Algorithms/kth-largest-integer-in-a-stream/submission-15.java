class KthLargest {
    public PriorityQueue<Integer> minheap;
    public int k;
    public KthLargest(int k, int[] nums) {
        this.minheap =  new PriorityQueue<>();
        this.k = k;
        for (Integer num : nums) {
            this.minheap.add(num);
        }
        while (this.minheap.size() > k) {
            this.minheap.poll();
        }
    }
    
    public int add(int val) {
        this.minheap.offer(val);
        while (minheap.size() > k) {
            minheap.poll();
        }
        if (this.minheap.size() == 1 && k == 1) {
            return this.minheap.peek();
        }
        return this.minheap.peek();
    }
}
