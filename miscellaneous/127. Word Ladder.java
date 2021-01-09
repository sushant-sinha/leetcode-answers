// SUSHANT SINHA

// took from fishercoder1534 (hard category) { TRY }

// 88 ms

class Solution {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> beginSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();
        Set<String> visited = new HashSet<>();
        Set<String> dict = new HashSet<>(wordList);
        int len = 1;

        beginSet.add(beginWord);

        if (dict.contains(endWord)) {
            endSet.add(endWord);
        }

        while (!beginSet.isEmpty() && !endSet.isEmpty()) {
            Set<String> nextBeginSet = new HashSet<>();
            for (String word : beginSet) {
                char[] chars = word.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    for (char c = 'a'; c <= 'z'; c++) {
                        char old = chars[i];
                        chars[i] = c;
                        String newWord = new String(chars);
                        if (endSet.contains(newWord)) {
                            return len + 1;
                        }

                        if (!visited.contains(newWord) && dict.contains(newWord)) {
                            visited.add(newWord);
                            nextBeginSet.add(newWord);
                        }
                        chars[i] = old;
                    }
                }
            }

            beginSet = nextBeginSet;
            len++;
        }
        return 0;
    }
}


// 20 ms solution (better solution)

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(wordList == null || wordList.isEmpty())
            return 0;
        
        Set<String> wordSet = new HashSet<>(wordList);
        if(!wordSet.contains(endWord))
            return 0;
        
        Set<String> beginSet = new HashSet<>();
        beginSet.add(beginWord);
        Set<String> endSet = new HashSet<>();
        endSet.add(endWord);
        
        return biBfs(beginSet, endSet, wordSet, 1); 
    }
    
    public int biBfs(Set<String> beginSet, Set<String> endSet, Set<String> wordSet, int length) {
        if(beginSet.size() == 0 || endSet.size() == 0)
            return 0;
        
        if(beginSet.size() > endSet.size())
            return biBfs(endSet, beginSet, wordSet, length);
        
        Set<String> nextSeq = new HashSet<>();
        wordSet.removeAll(beginSet);
        
        for(String word : beginSet) {
            char[] charSet = word.toCharArray();
            for(int i=0; i<charSet.length; i++) {
                char ch = charSet[i];
                for(char j='a'; j<='z'; j++) {
                    charSet[i] = j;
                    String newWord = new String(charSet);
                    if(wordSet.contains(newWord)) {
                        if(endSet.contains(newWord))
                            return length + 1;
                        nextSeq.add(newWord);
                    }
                }
                charSet[i] = ch;
            }
        }
        if(!nextSeq.isEmpty())
            return biBfs(nextSeq, endSet, wordSet, length+1);
        return 0;
    }
}
