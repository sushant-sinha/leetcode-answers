class Solution {
    public int partitionString(String s) {
        int ans = 1;
        HashSet<Character> st = new HashSet<>();
        for(int i=0;i<s.length();i++){
 		  // Insert untill we find duplicate element.
            if(!st.contains(s.charAt(i))){
                st.add(s.charAt(i));
            }
            else{
			 // If we find the duplicate char then increment count and clear set and start with new set.
                ans++;
                st.clear();
                st.add(s.charAt(i));
            }
        }
        return ans;
    }
}

// best solution using bit manipulation

class Solution {
    public int partitionString(String s) {

        int map = 0;
        int count = 1;
        for(char c : s.toCharArray()){
            if((map & (1<<c)) != 0) {
                count++;
                map = 0;
            }
            map ^= (1<<c);
        }
        return count;
    }
}