// SUSHANT SINHA

// 1ms ( 100% ) 44.82mb ( 7.27% )

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<words.length;i++){

            // better to use words[i].indexOf(x) != -1 than using words[i].indexOf(x) >= 0
            if(words[i].indexOf(x)!=-1)
                ans.add(i);
        }
        return ans;
        
    }
}