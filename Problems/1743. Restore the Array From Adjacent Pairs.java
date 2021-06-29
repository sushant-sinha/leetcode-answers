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

// best solution

// 17ms ( 99.86% ) 77.7mb ( 95.88% )

class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        int[] index = new int[200001], res = new int[adjacentPairs.length + 1];
        boolean[] exist = new boolean[200001];
        for (int i = 0; i < adjacentPairs.length; ++i) {
            index[adjacentPairs[i][0] + 100000] += i;
            index[adjacentPairs[i][1] + 100000] += i;
            exist[adjacentPairs[i][0] + 100000] = !exist[adjacentPairs[i][0] + 100000];
            exist[adjacentPairs[i][1] + 100000] = !exist[adjacentPairs[i][1] + 100000];
        }
        //find start
        int start = 0;
        for (int i = 0; i <= 200000; ++i) {
            if (exist[i]) {
                start = i - 100000;
                break;
            }
        }
        int lastIndex = 0, next = start;
        for (int i = 0; i < res.length; ++i) {
            res[i] = next;
            int[] pair = adjacentPairs[index[next + 100000] - lastIndex];
            lastIndex = index[next + 100000] - lastIndex;
            next = pair[0] + pair[1] - next;
        }
        return res;
    }
}