class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {

        // map the start and end of all the good subarrays that we can build
        TreeMap<Integer, Integer> map=new TreeMap<>();

        for(int i=0;i<nums.length-1;i++){

            int end, start = i;
            // compare this number with the right neighbor
            for(end=i;end<nums.length-1;end++){
                if(nums[end]%2==nums[end+1]%2){
                    // start a new start index from the next element
                    // System.out.println("in for end = "+end);
                    break;
                }
            }
            // System.out.println("---------in for end = "+end + " "+start);
            map.put(start, end);
            i=end;
        }

        // last element is a good subarray in itself

        map.put(nums.length-1, nums.length-1);

        // for(Map.Entry<Integer, Integer> e: map.entrySet())
        //     System.out.println(e.getKey()+" ********* "+e.getValue());

        boolean[] answer=new boolean[queries.length];

        for(int i=0;i<queries.length;i++){
            
            int start=queries[i][0], end=queries[i][1];

            if(map.floorKey(start)!=null && map.get(map.floorKey(start))>=end){
                answer[i]=true;
            }
            // else
            // answer[i]= false;

        }

        return answer;
        
    }
}