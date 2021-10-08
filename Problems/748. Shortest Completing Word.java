// SUSHANT SINHA

// 3ms ( 89.15% ) 39.6mb ( 61.76% )

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
        // random answer of length >15
        String ans="zzzzzzzzzzzzzzzz";
        
        int charcount[]=new int[26];        
        
        
        for(char c:licensePlate.toLowerCase().toCharArray()){
            if(Character.isLetter(c))
                charcount[c-'a']++;
        }
        
        //System.out.println(Arrays.toString(charcount));
        
        
        for(String s:words){
            
            int words_count[]=new int[26];
            
            for(char c:s.toCharArray())                
                words_count[c-'a']++;
            
            //System.out.println(s+" "+Arrays.toString(words_count));
            
            boolean matched=true;
            
            for(int i=0;i<26;i++){
                
                if(charcount[i]!=0 && words_count[i]<charcount[i]){
                    matched=false;
                    break;
                }
                
            }
            
            //System.out.println(matched);
            
            if(matched && ans.length()>s.length())
                ans=s;
            
        }
        
        return ans;
        
    }
}

// best solution

// 1ms ( 100% ) 39.1mb ( 90.70% )

class Solution {
    private static final int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};

    public String shortestCompletingWord(String licensePlate, String[] words) {
        long charProduct = getCharProduct(licensePlate.toLowerCase());
        String shortest = "aaaaaaaaaaaaaaaa";

        for(String word : words)
            if(word.length() < shortest.length() && getCharProduct(word) % charProduct == 0)
                shortest = word;

        return shortest;
    }

    private long getCharProduct(String plate) {
        long product = 1L;

        for(char c : plate.toCharArray()) {
            int index = c - 'a';

            if(0 <= index && index <= 25)
                product *= primes[index];
        }
        return product;
    }
}