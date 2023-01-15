// SUSHANT SINHA

// 68ms ( 7.77% ) 83.5mb ( 5.22% )

class DataStream {
    
    // mapping the index and the value
    TreeMap<Integer, Integer> ar=new TreeMap<>();
    int value=0, k=0, index=0;

    public DataStream(int value, int k) {
        
        this.value=value;
        this.k=k;
        
    }
    
    public boolean consec(int num) {
        
        // System.out.println(index+" "+ar.size());

        if(num!=value){
        ar.clear();
        return false;
        }
        
        if(ar.size()+1<k){
            ar.put(index++, num);
            // System.out.println(index+" "+ar.get(index));
            return false;
        }
        
        if(ar.size()+1==k){
            ar.put(index++, num);

            // System.out.println(" low="+(index-k)+" high="+(index-1));
            
            if(ar.get(index-k)==value && ar.get(index-1)==value)
                return true;
            
        }

        if(ar.size()==k){

            ar.remove(index-k);
            ar.put(index++, num);

            // System.out.println("removed index="+(index-k-1)+" low="+(index-k)+" high="+(index-1));
            // System.out.println("val="+ar.get(index-k)+" val="+ar.get(index-1));

            if(ar.get(index-k)==value && ar.get(index-1)==value)
                return true;
        }
        
        return false;
        
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */