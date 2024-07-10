class Solution {
    public int numberOfAlternatingGroups(int[] colors) {

        int ans=0;

        int length=colors.length;


        for(int i=0; i<length;i++){

            if(colors[i%length]!=colors[(i+1)%length] && colors[(i+1)%length]!=colors[(i+2)%length])
                ans++;
        }

        return ans;
        
    }
}