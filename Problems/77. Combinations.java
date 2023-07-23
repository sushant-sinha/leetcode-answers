// SUSHANT SINHA

// 84ms ( 8% ) 45mb ( 92.61% )

class Solution {

    List<List<Integer>> ans=new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {

        // using recursion directly
        // helper(ArList, curIndex, max, lenOfAns);
        ArrayList<Integer> temp=new ArrayList<>();
        helper(temp, 0, n, k);

        return ans;
        
    }

    void helper(ArrayList<Integer> temp, int curIndex, int max, int k){

        // Collections.sort(temp);
        // System.out.println(temp+" bool="+(temp.size()==k)+" size="+temp.size()+" k="+k);
        if(temp.size()==k){
            // System.out.println("adding="+temp);
            ans.add(new ArrayList<>(temp));
            // System.out.println("ans="+ans);
            return;
        }

        // System.out.println("for curIndex="+curIndex);

        for(int i=curIndex+1; i<=max; i++){
            temp.add(i);
            helper(temp, i, max, k);
            temp.remove(new Integer(i));
        }

        return;

    }
}