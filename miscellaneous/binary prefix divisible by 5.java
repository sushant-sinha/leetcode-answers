// SUSHANT SINHA

class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> ans = new ArrayList<>();
        /*
        	same as
			ArrayList<Boolean> ans = new ArrayList<Boolean>();	

        */
        int temp = 0;
        for (int x:A) {
            temp = 2 * temp + x;
            temp %= 5;
            ans.add(temp % 5 == 0);
        }

        return ans;
    }
    
}    