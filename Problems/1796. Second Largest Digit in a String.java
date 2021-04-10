// SUSHANT SINHA

// 9ms ( 12.67% ) 38.8mb ( 61.07% )

class Solution {
    public int secondHighest(String s) {
        
        // can use boolean array to check existence of 0-9 number
        // boolean exist[]=new boolean[11];
        
        ArrayList<Integer> exist = new ArrayList<>();
        
        for(char x:s.toCharArray()){
            
            if(Character.isDigit(x)){
                if(!exist.contains(Character.getNumericValue(x))){
                    exist.add(Character.getNumericValue(x));
                }
            }
            
        }
        
        Collections.sort(exist);
        
        try{
            return exist.get(exist.size()-2);
        }
        catch(Exception e){
            return -1;
        }
        
        
        
    }
}