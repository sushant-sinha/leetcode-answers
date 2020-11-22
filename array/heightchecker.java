// SUSHANT SINHA
class Solution {
    public int heightChecker(int[] a) {
        int x,count=0;
        int comp[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        comp[i]=a[i];
        for(int i=0;i<comp.length;i++){
            for(int j=(i+1);j<comp.length;j++){
                if(comp[i]>comp[j]){
                    x=comp[i];comp[i]=comp[j];comp[j]=x;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(comp[i]!=a[i])
                count++;
        }
        return count;
    }
}