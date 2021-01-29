// SUSHANT SINHA

// 0ms 37.4mb

class Solution {
    public boolean checkRecord(String s) {
        int absentCnt = 0;
        int lateCnt = 0;
        
        for (char c: s.toCharArray()) {
            if (c == 'A') {
                absentCnt++;
                if (absentCnt > 1) {
                    return false;
                } 
                lateCnt = 0;
            } else if (c == 'L') {
                lateCnt ++;
                if (lateCnt > 2) {
                    return false;
                }
            } else {
                lateCnt = 0;
            }
        }
        return true;
    }
}
