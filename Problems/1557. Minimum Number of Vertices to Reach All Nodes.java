// SUSHANT SINHA

// 29ms ( 12.47% ) 92.2mb ( 7.46% )

// check the editorial and hints

class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {

        List<Integer> ans= new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();

        for(int i=0;i<n;i++){
            seen.add(i);
        }

        Integer temp=new Integer(0);

        for(int i=0;i<edges.size();i++){
            
            // ans.remove(Integer.valueOf(edges.get(i).get(1)));
            // above or this
            temp=edges.get(i).get(1);
            if(seen.contains(temp))
            seen.remove(temp);

        }

        for(int i:seen)
            ans.add(i);

        return ans;
        
    }
}