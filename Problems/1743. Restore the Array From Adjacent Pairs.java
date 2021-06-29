// based on solution given by: https://leetcode.com/Krishna_Unnikrishnan/

// 104ms ( 92.86% ) 88mb ( 63.74% )

class Solution {
    public int[] restoreArray(int[][] arr) {

     Map<Integer, List<Integer>> map = new HashMap<>();
     
     for(int i = 0; i < arr.length; i++) {

         map.putIfAbsent(arr[i][0], new ArrayList<>());
         map.putIfAbsent(arr[i][1], new ArrayList<>());

         map.get(arr[i][0]).add(arr[i][1]);
         map.get(arr[i][1]).add(arr[i][0]);    
     }

     int start = 0;
     int count = 1, prev = start;
     int[] ans = new int[arr.length+1];

     for(Integer key : map.keySet()) {
         if(map.get(key).size() == 1) {
             start = key; break;
         }
     }

     ans[0] = start;

     while(count < arr.length + 1) {

         List<Integer> ansSet = map.get(start);

         if(ansSet.get(0) != prev) ans[count++] = ansSet.get(0);
         else ans[count++] = ansSet.get(1);

         prev = start;
         start = ans[count-1];
     }

     return ans;

     }
}