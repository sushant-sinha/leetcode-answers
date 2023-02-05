class Solution {
    public int[] separateDigits(int[] nums) {
        
        ArrayList<Character> list=new ArrayList<>();
        
        for(int i:nums){
            
            for(char c:Integer.toString(i).toCharArray())
                list.a2553. Separate the Digits in an Array
dd(c);
            
        }
        
        int size=list.size();
        int ans[]=new int[size];
        int x=0;
        
        for(int i:list){
            ans[x++]=Character.getNumericValue(i);
        }
        
        return ans;
    }
}