// SUSHANT SINHA

// 3ms ( 55.45% ) 39mb ( 78.80% )

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        HashMap<Integer,Integer> count=new HashMap<>();
        
        Arrays.sort(arr1);
        
        //System.out.println(Arrays.toString(arr1));
                
        for(int i:arr1){
            
            if(count.containsKey(i))
                count.put(i,count.get(i)+1);
            
            else
                count.put(i,1);
            
        }
        
        int index=0;
        
        for(int i:arr2){
            
            if(count.containsKey(i)){
                
                int x=count.get(i);
                
                while(x!=0){
                    
                    arr1[index++]=i;
                    x--;
                }
                
                count.remove(i);
                
            }
            
        }
        
        // using TreeMap to sort the remaining key:values based on the key
        // https://www.javatpoint.com/how-to-sort-hashmap-in-java
        
        TreeMap<Integer,Integer> tmap=new TreeMap<Integer,Integer>(count);
        
        Iterator itr=tmap.keySet().iterator();
        
        
        if(!count.isEmpty()){
            
            int key;
            
            while(itr.hasNext()){
                
                key=(int)itr.next();
                
                for(int i=0;i<(int)count.get(key);i++)
                    arr1[index++]=key;
                
            }
            
        }
        
        return arr1;
        
    }
}