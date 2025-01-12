// SUSHANT SINHA

// 28ms ( 17.55% ) 45.90MB ( 7.00% )

class Solution {
    public boolean canConstruct(String s, int k) {

        if(k>s.length())
            return false;

        // int freq[]=new int[26];

        HashMap<Character, Integer> map=new HashMap<>();

        for(char c: s.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);

        // System.out.println(map);

        // don't consider the characters that appear only once

        // construct all palindromes
        int singlePal=0, multiPal=0;

        for(Map.Entry<Character, Integer> e: map.entrySet()){

            int freq=e.getValue();

            if(freq%2==0)
                multiPal+=e.getValue()/2;

            else if(freq==1)
                singlePal++;

            else{
                singlePal+=1;
                multiPal+=freq/2;
            }
                
        }

        // System.out.println("single ="+singlePal+" multiple ="+multiPal);

        // then try to club them

        // one single can be merged with one multi
        // all multi can be safely merged with each other

        int ans=multiPal+singlePal;

        // while(ans!=k){
        //     // club
        //     if(ans>k && multiPal>1 && singlePal>1){
        //         multiPal--;
        //         singlePal--;
        //         ans--;
        //     }

        //     else
        //         return false;

        //     if(ans==k)
        //         return true;
            
        // }

        if(singlePal>k)
            return false;
        
        return true;
        
    }
}