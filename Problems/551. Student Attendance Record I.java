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

// 18ms 41.1mb

class Solution {
    public boolean checkRecord(String s) {
        
        if(s.length()==1 || s.length()==0)return true;
        
        String split[]=s.split("");
        int a=0;
        
        if(split[split.length-1].equals("A"))a++;
        if(split[split.length-2].equals("A"))a++;
        if(a>1)return false;
        
        for(int i=0;i<split.length-2;i++){
        	if(split[i].equals("A"))a++;
        	if(a>1)return false;
        	if(split[i].equals("L") && split[i+1].equals("L") && split[i+2].equals("L")){
                System.out.print(i+" "+" "+(i+1)+" "+(i+2));
                return false;
            }

        }

        return true;
        
    }
}   