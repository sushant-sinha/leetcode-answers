// SUSHANT SINHA

// my solution using treemap
// 485ms ( 91.27% ) 52.9mb ( 100% )

class Solution {
    public int minStoneSum(int[] piles, int k) {

        int sum=0, len=piles.length;

        // System.out.println((7-(Math.floor(7/2))));
        // System.out.println((7-(Math.floor(7/2)))<=7/2);
        // System.out.println((6-(Math.floor(6/2)))<=6/2);

        TreeMap<Integer, Integer> map=new TreeMap<>();

        for(int i:piles){

            sum+=i;

            map.put(i, map.getOrDefault(i, 0)+1);
        }

        while(k!=0){

            int key=map.lastKey();
            int diff=key/2;

            int keyVal=map.get(key);

            // System.out.println("after choosing "+key+" "+diff+" "+sum);

            if(keyVal==1){
                map.remove(key);
            }

            else{
                map.put(key, keyVal-1);    
            }

            map.put(key-diff, map.getOrDefault(key-diff, 0)+1);

            sum-=diff;

            k--;
        }

        return sum;
        
    }
}

// best solution from the submission tab (120x better)
// 4ms ( 100% ) 55.4mb ( 89.98% )


//--Instead of  using PriorityQueue , we can use array to track number of piles with same heigth

public class Solution {
    public int minStoneSum(int[] piles, int k) {
        int sum = 0;
        int a[] = new int[10001];
        for (int i : piles) {
            sum += i;
            a[i]++;
        }
        for (int i = 10000; i > 0 && k > 0; i--) {
            if (a[i] > 0) {
                int b = i / 2;
                sum -= Math.min(k, a[i]) * b;
                a[i - i / 2] += a[i];
                k -= a[i];
            }
        }
        return sum;

    }
}
// Time complexity : O(n)