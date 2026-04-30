class MinStack {
    private ArrayList<Integer> stack = new ArrayList<>();
    private ArrayList<Integer> minStack = new ArrayList<>();
    private int min;
    public MinStack() {
        ArrayList<Integer> stack = new ArrayList<>();
        this.stack = stack;
    }
    
    public void push(int val) {
        if (this.stack.isEmpty()) {
            this.minStack.add(val);
            this.min = val;
        } 
        if (val <= this.min) {
            this.min = val;
            this.minStack.add(val);
        }
        this.stack.add(val);
    }
    
    public void pop() {
        if (this.stack.get(this.stack.size() - 1) == this.min) {
            this.minStack.remove(this.minStack.size() - 1);
            this.min = this.minStack.get(this.minStack.size() - 1);
        }
        this.stack.remove(this.stack.size() - 1);
    }
    
    public int top() {
        return this.stack.get(this.stack.size() - 1);
    }
    
    public int getMin() {
        return this.min;
    }
}
