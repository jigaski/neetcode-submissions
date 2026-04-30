class MinStack {
    private ArrayList<Integer> stack = new ArrayList<>();
    
    public MinStack() {
        ArrayList<Integer> stack = new ArrayList<>();
        this.stack = stack;
    }
    
    public void push(int val) {
        this.stack.add(val);
    }
    
    public void pop() {
        this.stack.remove(this.stack.size() - 1);
    }
    
    public int top() {
        return this.stack.get(this.stack.size() - 1);
    }
    
    public int getMin() {
        return Collections.min(this.stack);
    }
}
