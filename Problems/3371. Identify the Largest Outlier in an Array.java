class Solution {
    public int getLargestOutlier(int[] nums) {

        HashMap<Integer, Integer> map=new HashMap<>();

        int totalSum=0;

        for(int i: nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }

            else{
                map.put(i,1);
            }

            totalSum+=i;
        }

        int outlier=Integer.MIN_VALUE;

        for(int i: nums){

            int expectedSum=i*2;

            int elementToFind=totalSum-expectedSum;

            // System.out.println("----- elementToFind="+elementToFind+" i="+i);

            // if the elementToFind is same as that of the element which we just checked, check if the frequency is more than, else this will be the number that we want to remove
            if(i==elementToFind){
                if(map.get(i)>1){
                    // System.out.println("for int i = "+i+" outlier = "+elementToFind+" freq of i = "+map.get(i));
                    outlier=Math.max(outlier, elementToFind);
                }
            }

            else if(map.containsKey(elementToFind)){
                // System.out.println("for int i = "+i+" outlier = "+elementToFind);
                outlier=Math.max(outlier, elementToFind);
            }
        }

        return outlier;
        
    }
}