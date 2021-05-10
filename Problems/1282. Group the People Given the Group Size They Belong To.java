// SUSHANT SINHA

// my solution
// 9ms ( 11.86% ) 39.8mb ( 26.47% )

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
        ArrayList<Integer> grp = new ArrayList<>();
                
        for(int i:groupSizes)
            grp.add(i);
        
        Collections.sort(grp);
        
        List<List<Integer>> ans= new ArrayList<>();
        
        
        for(int i=1;i<=grp.get(grp.size()-1);i++){
            
            if(!grp.contains(i))
                continue;
            
            int j=0;
            
            while(j<groupSizes.length){
            
                List<Integer> temp = new ArrayList<>();                
                
                for(;j<groupSizes.length;j++){
                    if(temp.size()==i){
                        break;
                    }
                    else if(groupSizes[j]==i)
                        temp.add(j);

                }
                
                if(temp.size()!=0)
                    ans.add(temp);
            }
            
        }
        
        return ans;
        
    }
}

// best solution
// 2ms

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) 
    {
        int n = groupSizes.length;
        ArrayList<Integer> a= new ArrayList<>();
        List<List<Integer>> ret = new ArrayList<>();
        
        for(int i =0; i<n ; i++)
        {
            if( groupSizes[i] !=0 )
            {
                a= new ArrayList<>();
                a.add(i);
                for(int j=i+1;  j <n; j++ )
                {
                    if(groupSizes[i] == groupSizes[j])
                    {
                        if(a.size() != groupSizes[i])
                        {
                            a.add(j);
                            groupSizes[j] =0;
                        }
                        else if( a.size() == groupSizes[i])
                        {
                            ret.add(a);
                            a= new ArrayList<>();
                            a.add(j);
                            groupSizes[j] =0;
                        }
                    }
                }
                ret.add(a);
            }
            
        }
        return ret;
        
    }
}