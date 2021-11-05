class Solution {
public String largestNumber(int[] nums) {

    if(nums.length==0)
    {
        return "";
    }
    
    String[] s = new String[nums.length];
    for(int i=0;i<nums.length;i++)
    {
        s[i] = Integer.toString(nums[i]);
    }
    
    Arrays.sort(s, new Comparator<String>(){
        public int compare(String a, String b)
        {
            String o1= a+b;
            String o2= b+a;
            return o2.compareTo(o1);
        }
    });
    
    if(s[0].equals("0"))
    {
        return "0";
    }
    
    StringBuilder sb = new StringBuilder();
    for(String str: s)
    {
        sb.append(str);
    }
    
    return sb.toString();
    
}
}