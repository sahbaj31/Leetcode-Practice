class MyStack {

    Queue<Integer> a = new LinkedList<>();

    public MyStack() {
    
    }
    
    public void push(int x) {
        if(a.size()==0){
            a.add(x);
        }
        else{
            a.add(x);
            for(int i=1; i<=a.size()-1; i++){
                a.add(a.remove());
            }
        }

        
    }
    
    public int pop() {
        
        int val = a.remove();
        return val;
    }
    
    public int top() {
        int val = a.peek();
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