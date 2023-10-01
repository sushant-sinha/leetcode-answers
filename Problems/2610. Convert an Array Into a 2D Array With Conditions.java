class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {

        HashMap<Integer, Integer> freq=new HashMap<>();

        for(int i:nums){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }

        List<List<Integer>> ans=new ArrayList();

        // for(Map.Entry<Integer, Integer> e: freq.entrySet()){
        //     System.out.println(e.getKey()+" "+e.getValue());
        //     // System.out.println(e.getValue());
        // }

        int size=freq.size();

        while(size!=0){
            ArrayList<Integer> temp=new ArrayList<>();

            // since we cannot remove elements while iterating the HashMap
            // we will get ConcurrentModificationException

            // so we will maintain another arraylist to maintain the keys are to be removed from the HashMap

            ArrayList<Integer> toRemove= new ArrayList<>();

            for(Map.Entry<Integer, Integer> e: freq.entrySet()){
                int val=e.getValue();
                int key=e.getKey();

                temp.add(key);

                if(val==1){
                    size--;
                    toRemove.add(key);
                    // freq.remove(key);
                }

                else{
                    freq.put(key, val-1);
                }
            }

            for(int i: toRemove)
                freq.remove(i);

            ans.add(temp);
        }

        return ans;
        
    }
}