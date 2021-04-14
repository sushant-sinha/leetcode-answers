// SUSHANT SINHA

// from discuss section

// 1ms ( 100% ) 38.7mb ( 91.69% )

class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sCharList = s.toCharArray();
        char[] tCharList = t.toCharArray();
        
        char[] transRelation = new char[128];
        boolean[] targetTrans = new boolean[128];
        
        for (int i = 0, len = sCharList.length; i < len; i++) {
            char sChar = sCharList[i];
            char willChar = transRelation[sChar];
            if (willChar != 0 && willChar != tCharList[i]) {
                return false;
            }
            if (transRelation[sChar] == 0) {
                if (targetTrans[tCharList[i]]) {
                    return false;
                }
                transRelation[sChar ] = tCharList[i];
                targetTrans[tCharList[i]] = true;
            }
        }
        return true;
    }
}