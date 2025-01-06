class Solution {
    public String shiftingLetters(String s, int[][] shifts) {

        int len=s.length();
        int[] pos=new int[len];

        for(int i=0;i<shifts.length;i++){

            int dir=shifts[i][2]==1 ? 1 : 25;

            for(int x=shifts[i][0]; x<=shifts[i][1];x++)
                pos[x]= (pos[x]+dir)%26;
        }

        // System.out.println(Arrays.toString(pos));

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<len;i++){
            // System.out.println(s.charAt(i)+" "+(s.charAt(i)+pos[i]));
            char cur=s.charAt(i);
            int offset=pos[i];
            int newPos=cur+offset;
            if(newPos>'z')
                newPos=newPos%'z';
            if(newPos<'a')
                newPos+='a'-1;
            // System.out.println((char)newPos+" int "+newPos);
            sb.append((char)newPos);
        }

        return sb.toString();
        
    }
}