class MyQueue {

    Stack<Integer> add=new Stack<>();
    
    
    public MyQueue() {
        
    }
    
    public void push(int x){
               
        add.push(x);
    }
    
    public int pop() {
        
        Stack<Integer> temp=new Stack<>();
    
        while(!add.empty()){
            temp.push((Integer)add.pop());
        }
        
        int ans=(int)temp.pop();
        
        while(!temp.empty()){
            add.push((Integer)temp.pop());
        }
        
        return ans;
        
    }
    
    public int peek() {
        
        Stack<Integer> temp=new Stack<>();
    
        while(!add.empty()){
            temp.push((Integer)add.pop());
        }
        
        int ans=(int)temp.peek();
        
        while(!temp.empty()){
            add.push((Integer)temp.pop());
        }
        
        return ans;
    }
    
    public boolean empty() {
        
        return add.empty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */