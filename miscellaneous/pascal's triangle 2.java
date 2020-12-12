

public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> lastLine = new ArrayList<Integer>();
        
        lastLine.add(1);
        
        if(rowIndex == 0) return lastLine;
        
        ArrayList<Integer> thisLine = new ArrayList<Integer>();
        
        for(int i = 1; i <= rowIndex; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0) thisLine.add(1);
                else if(j < i){
                    thisLine.add(lastLine.get(j - 1) + lastLine.get(j));
                }
                else if(j == i){
                    thisLine.add(1);
                }
            }
            lastLine = thisLine;
            thisLine = new ArrayList<Integer>(); 
        }
        return lastLine;
        
    }
}