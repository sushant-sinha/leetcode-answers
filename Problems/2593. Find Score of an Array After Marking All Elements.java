// SUSHANT SINHA

// 669ms ( 5.01% ) 73.04MB ( 5.03% )

class Solution {
    public long findScore(int[] nums) {

        long ans=0;

        // map all the numbers with their position in array
        TreeMap<Integer, ArrayList<Integer>> map=new TreeMap<>();

        for(int index=0; index<nums.length;index++){

            int i=nums[index];

            ArrayList<Integer> ar;

            if(map.containsKey(i))
                ar=map.get(i);

            else
                ar=new ArrayList<>();

            ar.add(index);
            map.put(i, ar);
        }

        int markedCounter=nums.length;

        // super slow
        while(markedCounter!=0){

            int choose = map.firstKey();
            ans+=choose;

            markedCounter--;

            // remove choose from the map

            ArrayList<Integer> chosenIndices=map.get(choose);
            int curIndex=chosenIndices.get(0);

            // System.out.println("picking "+choose);

            // get the index for that number - 1
            int leftIndex=curIndex-1;
            int rightIndex=curIndex+1;

            if(leftIndex>=0 && nums[leftIndex]!=0){

                markedCounter--;
                
                ArrayList<Integer> indices = map.get(nums[leftIndex]);
                indices.remove(new Integer(leftIndex));

                if(indices.size()==0)
                    map.remove(nums[leftIndex]);

                nums[leftIndex]=0;
            }

            if(rightIndex<nums.length && nums[rightIndex]!=0){

                markedCounter--;
                
                ArrayList<Integer> indices = map.get(nums[rightIndex]);
                indices.remove(new Integer(rightIndex));

                if(indices.size()==0)
                    map.remove(nums[rightIndex]);

                nums[rightIndex]=0;
            }

            chosenIndices.remove(new Integer(curIndex));
            if(chosenIndices.size()==0){
                map.remove(new Integer(choose));
            }
        }

        return ans;
        
    }
}