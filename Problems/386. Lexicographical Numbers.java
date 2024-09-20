class Solution {
    public List<Integer> lexicalOrder(int n) {

        TreeSet<String> nums=new TreeSet<>();

        for(int i=1;i<=n;i++){

            nums.add(Integer.toString(i));
        }

        List<Integer> ans=new ArrayList<>();

        for(String i:nums)
            ans.add(Integer.parseInt(i));

        return ans;
        
    }
}