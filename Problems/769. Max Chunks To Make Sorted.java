// SUSHANT SINHA

// 1ms ( 100.00% ) 41.12MB ( 31.83% )

class Solution {
    public int maxChunksToSorted(int[] arr) {

        int ans=0;

        for(int i=0;i<arr.length;i++){

            boolean flag=false;

            if(arr[i]!=i){
                // start a window
                int start=i, end=i;

                HashSet<Integer> need=new HashSet<>();
                HashSet<Integer> seen=new HashSet<>();

                need.add(i);
                seen.add(arr[i]);

                while(!same(need, seen) && i<arr.length){
                    need.add(i);
                    seen.add(arr[i]);
                    flag=true;
                    i++;
                    
                }

                // System.out.println("out with i="+i);
            }

            if(flag && i<arr.length)
                --i;
            // else
            //     i++;

            // System.out.println("iteration for i="+i);

            ans++;
        }

        return ans;
        
    }

    boolean same(HashSet<Integer> s1, HashSet<Integer> s2){

        HashSet<Integer> copy1=new HashSet<>();
        HashSet<Integer> copy2=new HashSet<>();

        for(int i:s1)
            copy1.add(i);

        for(int i:s2)
            copy2.add(i);

        for(int i: copy1){
            if(copy2.contains(i))
                copy2.remove(new Integer(i));
                
            else
                return false;
        }

        return true;
    }
}