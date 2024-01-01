class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<words.length;i++){

            // better to use !=-1 than >=0
            if(words[i].indexOf(x)!=-1)
                ans.add(i);
        }
        return ans;
        
    }
}