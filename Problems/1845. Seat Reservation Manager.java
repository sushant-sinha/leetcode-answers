// SUSHANT SINHA

// 70ms ( 100% ) 88.4mb ( 100% )

class SeatManager {

    ArrayList<Integer> unr=new ArrayList<>();
    int latest=0;
    
    public SeatManager(int n) {
        
    }
    
    public int reserve() {
        
        if(unr.size()==0){
            return ++latest;
        }
        
        else{
            Collections.sort(unr);
            int ans=unr.get(0);
            unr.remove(0);
            return ans+1;
        }
        
    }
    
    public void unreserve(int seatNumber) {
        
        unr.add(seatNumber-1);
        
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */