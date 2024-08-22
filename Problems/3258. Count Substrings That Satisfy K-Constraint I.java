// SUSHANT SINHA

// 10ms ( 20.76% ) 44.33mb ( 14.54% )

class Solution {
    public int countKConstraintSubstrings(String s, int k) {

        HashMap<Integer, int[]> map=new HashMap<>();

        int ans=0;

        int one=0, zero=0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='0')
                zero++;
            else
                one++;
            
            map.put(i,new int[]{zero, one});
        }

        map.put(-1, new int[]{0, 0});

        for(int i=-1;i<s.length()-1;i++){

            for(int j=i+1;j<s.length();j++){

                int[] counter1=(int[])map.get(i);
                int[] counter2=(int[])map.get(j);

                if(Math.abs(counter1[0]-counter2[0])<=k || Math.abs(counter1[1]-counter2[1])<=k)
                    ans++;
            }
        }

        return ans;
        
    }
}