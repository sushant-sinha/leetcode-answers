class Solution {
    public int countKConstraintSubstrings(String s, int k) {

        HashMap<Integer, int[]> map=new HashMap<>();

        int ans=0;
        // ans+=s.length();

        int one=0, zero=0;

        for(int i=0;i<s.length();i++){

            // int[] counter=new int[2];

            if(s.charAt(i)=='0')
                zero++;
            else
                one++;
            
            map.put(i,new int[]{zero, one});
        }

        map.put(-1, new int[]{0, 0});
        // map.put(s.length(), new int[]{zero, one});

        // System.out.println(Arrays.toString(counter));

        // check all the substrings of length 2 or more
        for(int i=-1;i<s.length()-1;i++){

            for(int j=i+1;j<s.length();j++){

                int[] counter1=(int[])map.get(i);
                int[] counter2=(int[])map.get(j);

                // int min=Math.min(, );

                // System.out.println("for substring: "+i+" "+j+ " min="+Arrays.toString(counter1)+" "+Arrays.toString(counter2));
                // System.out.println(Arrays.toString(counter));
                // System.out.println(Math.abs(counter1[0]-counter2[0])<=k || Math.abs(counter1[1]-counter2[1])<=k);

                if(Math.abs(counter1[0]-counter2[0])<=k || Math.abs(counter1[1]-counter2[1])<=k)
                    ans++;
            }
        }

        return ans;
        
    }
}