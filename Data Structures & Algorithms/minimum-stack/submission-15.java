class MinStack {
    ArrayList<Integer> stack = new ArrayList<>();
    public MinStack() {
        ArrayList<Integer> stack = new ArrayList<>();
        this.stack = stack;
    }
    
    public void push(int val) {
        this.stack.add(val);
    }
    
    public void pop() {
        int i;
        for (i = 0; i < this.stack.size(); i++) {
            ;
        }
        int res = this.stack.get(i - 1);
        System.out.println(res);
        this.stack.remove(i - 1);
    }
    
    public int top() {
        return this.stack.get(this.stack.size() - 1);
    }
    
    public int getMin() {
        return Collections.min(this.stack);
    }
}
