class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        // map the number with the index
        TreeMap<Integer, TreeSet<Integer>> map=new TreeMap<>();

        for(int i=0;i<nums.length;i++){

            TreeSet<Integer> index;
            
            if(map.containsKey(nums[i]))
                index=map.get(nums[i]);

            else
                index=new TreeSet<>();

            index.add(i);

            map.put(nums[i], index);
        }

        for(int i=0;i<k;i++){

            //get the first key, which is the smallest number

            int smallest=map.firstKey();
            // get the index of this number

            TreeSet<Integer> indices=map.get(smallest);

            int numIndex=indices.getFirst();

            nums[numIndex]=smallest*multiplier;

            indices.remove(numIndex);

            if(indices.size()==0)
                map.remove(new Integer(smallest));

            else
                map.put(smallest, indices);
            
            // add the new element

            TreeSet<Integer> newIndices;

            if(map.containsKey(smallest*multiplier))
                newIndices=map.get(smallest*multiplier);

            else
                newIndices=new TreeSet<>();

            newIndices.add(numIndex);

            map.put(smallest*multiplier, newIndices);

            // System.out.println(smallest);
        }

        return nums;
        
    }
}