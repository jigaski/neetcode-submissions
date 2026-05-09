class KthLargest {
    public PriorityQueue<Integer> minheap;
    public int k;
    public KthLargest(int k, int[] nums) {
        this.minheap =  new PriorityQueue<>(Collections.reverseOrder());
        this.k = k;
        for (Integer num : nums) {
            this.minheap.offer(num);
        }
    }
    
    public int add(int val) {
        this.minheap.offer(val);
        List<Integer> toQ = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (i == k - 1) {
                break;
            }
            toQ.add(this.minheap.poll());
        }
        int res = this.minheap.poll();
        for (Integer num : toQ) {
            this.minheap.offer(num);
        }
        minheap.offer(res);
        return res;
    }
}
