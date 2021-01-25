// SUSHANT SINHA

class Solution {
    public int[] constructRectangle(int area) {
        for(int i = (int) Math.sqrt(area); i >= 1;i--){
            if(area%i == 0) return new int[]{area/i,i};
        }
        return new int[]{0,0};
    }
}