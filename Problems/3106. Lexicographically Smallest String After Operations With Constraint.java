class Solution {
    public String getSmallestString(String s, int k) {

        StringBuilder ans=new StringBuilder();

        for(int i=0;i<s.length();i++){

            int res[]=nextChar(s.charAt(i), k);

            // System.out.println((char)res[0]+" "+res[1]);

            k=res[1];

            ans.append((char)(res[0]));
        }

        return ans.toString();
        
    }

    int[] nextChar(char c, int k){

        char ans='a';

        // System.out.println("diff val="+dist(c, ans)+" "+c+" "+ans);
        
        while( dist(c, ans)>k){

            // System.out.println("diff vallllll="+dist(c, ans)+" "+c+" "+ans);
            
            ans++;
        }

        // System.out.println(k-dist(c, ans));

        return new int[]{ans, k-dist(c, ans)};
    }

    int dist(char a, char b){

        return Math.abs(a-b)>13 ? 26-Math.abs(a-b) : Math.abs(a-b);
    }
}