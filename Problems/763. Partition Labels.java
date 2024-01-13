// SUSHANT SINHA

// 4ms ( 92.70% ) 42.00mb ( 38.65% )

class Solution {
    public List<Integer> partitionLabels(String s) {

        ArrayList<Integer> ans=new ArrayList<>();

        int index[]=new int[26];

        for(int i=0;i<s.length();i++)
            index[s.charAt(i)-'a']=i;

        for(int i=0;i<s.length();i++){

            int end=index[s.charAt(i)-'a'];

            for(int j=i;j<end;j++){
                int newEnd=index[s.charAt(j)-'a'];

                if(newEnd>end)
                    end=newEnd;
            }

            ans.add(end-i+1);
            i=end;

        }

        return ans;

    }
}