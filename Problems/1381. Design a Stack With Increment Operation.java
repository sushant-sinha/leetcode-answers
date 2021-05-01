// SUSHANT SINHA

class CustomStack {
    
    // definind global variables

    int start=0;
    int ar[];

    public CustomStack(int maxSize) {
        
        ar=new int[maxSize];
        
    }
    
    public void push(int x) {
        
        if(start<ar.length){
            ar[start]=x;
            start++;
        }
        
    }
    
    public int pop() {
        
        if(start==0)
            return -1;
        
        start--;
        return ar[start];
        
    }
    
    public void increment(int k, int val) {
        
        int till= k<start ? k : start;
        
        for(int i=0;i<till;i++){
            ar[i]+=val;
        }
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */