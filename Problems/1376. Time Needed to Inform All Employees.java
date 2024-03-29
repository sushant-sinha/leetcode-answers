// SUSHANT SINHA

// 72ms ( 67.92% ) 63.3mb ( 26.51% )

// knew the logic and approach but was not able to think of using nested arraylist😥....rather preferred using hashmap and tried optimising
// had to refer the editorial section

class Solution {

    int ans=Integer.MIN_VALUE;

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {

        // map to know the managers
        // mapping manager and their subordinates: ArrayList<i> contains the ArrayList of all the subordinates
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(n);

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<Integer>());
        }

        // Making an adjacent list, each index stores the Ids of subordinate employees.
        for (int i = 0; i < n; i++) {
            if (manager[i] != -1) {
                adjList.get(manager[i]).add(i);
            }
        }

        // for(int i: informTime)

        helper(adjList, 0, informTime, headID);
        return ans;

        // return 2;
        
    }

    void helper(ArrayList<ArrayList<Integer>> ar, int curMax, int[] time, int curManager){

        ArrayList<Integer> temp=ar.get(curManager);

        // System.out.println("manager = "+curManager);

        ans=Math.max(curMax, ans);

        for(int i:temp){
            helper(ar, curMax+time[curManager], time, i);
        }

    }
}