class MyStack {

    Queue<Integer> a = new LinkedList<>();

    public MyStack() {
    
    }
    
    public void push(int x) {
        a.add(x);
        
    }
    
    public int pop() {
        for(int i=1; i<=a.size()-1; i++){
            a.add(a.remove());
        }
        int val = a.remove();
        return val;
    }
    
    public int top() {
        for(int i=1; i<=a.size()-1; i++){
            a.add(a.remove());
        }
        int val = a.peek();
        a.add(a.remove());
        return val;
    }
    
    public boolean empty() {
        if(a.size()==0) return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */