// SUSHANT SINHA

// 6ms ( 5.66% ) 45.18MB ( 19.33% )

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        TreeMap<Integer, TreeSet<Integer>> valAndIndex=new TreeMap<>();
        
        // int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            TreeSet<Integer> ar;

            if(valAndIndex.containsKey(nums[i]))
                ar=valAndIndex.get(nums[i]);

            else
                ar=new TreeSet<>();

            ar.add(i);

            valAndIndex.put(nums[i], ar);
        }

        for(int i=0;i<k;i++){

            TreeSet<Integer> firstElement=valAndIndex.get(valAndIndex.firstKey());
            // System.out.println(firstElement);
            int index1=firstElement.pollFirst();

            if(firstElement.size()==0){
                valAndIndex.remove(valAndIndex.firstKey());
            }
            nums[index1]*=multiplier;

            TreeSet<Integer> ar;

            if(valAndIndex.containsKey(nums[index1]))
                ar=valAndIndex.get(nums[index1]);

            else
                ar=new TreeSet<>();

            ar.add(index1);

            // System.out.println(nums[index1]+" "+ar);

            valAndIndex.put(nums[index1], ar);

        }

        return nums;
    }
}

// O(N⋅logN+k⋅logN), since not using inbuilt heap
// from the editorial
// understand how the custom comparator works for Collections

 class Solution {

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> {
            int valueComparison = Integer.compare(a[0], b[0]);
            if (valueComparison == 0) {
                return Integer.compare(a[1], b[1]);
            }
            return valueComparison;
        });

        for (int i = 0; i < nums.length; i++) {
            heap.offer(new int[] { nums[i], i });
        }

        while (k-- > 0) {
            int[] smallest = heap.poll();
            int index = smallest[1];

            nums[index] *= multiplier;
            heap.offer(new int[] { nums[index], index });
        }

        return nums;
    }
}
