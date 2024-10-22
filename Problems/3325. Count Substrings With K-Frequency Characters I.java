class Solution {
    public int numberOfSubstrings(String s, int k) {

        char ar[]=s.toCharArray();

        int ans=0;

        for(int i=0;i<s.length();i++){

            int freq[]=new int[26];

            for(int j=i;j<s.length();j++){
                
                freq[ar[j]-'a']++;
                
                if(freq[ar[j]-'a']>=k){
                    // System.out.println("in for char "+ar[j]+" index="+j);
                    ans+=s.length()-j;
                    break;
                }
                
            }

        }

        return ans;
        
    }
}