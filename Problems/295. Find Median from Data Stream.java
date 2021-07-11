// SUSHANT SINHA

// 1596ms ( 6.12% ) 50.3mb ( 61.79% )
// basic implementation.... bad performance

class MedianFinder {
    
    ArrayList<Integer> ar=new ArrayList<>();
    int len=0;

    /** initialize your data structure here. */
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        
        ar.add(num);
        len++;
        
    }
    
    public double findMedian() {
        
        Collections.sort(ar);
        
        if(len%2==0)
            return (double)(ar.get(len/2)+ar.get((len/2)-1))/2;
        
        else
            return (double)ar.get(len/2);
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */