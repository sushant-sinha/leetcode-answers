// SUSHANT SINHA

// 18ms ( 80.25% ) 41.6mb ( 99.57% )

class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        
        List<List<String>> ans = new ArrayList<>();

        Arrays.sort(products);
        
        for(int i=0;i<searchWord.length();i++){

        	ArrayList<String> temp = new ArrayList<>();

        	String s=searchWord.substring(0,i+1);

        	for(String x:products){
        		if(temp.size()==3)
        			break;

        		if(s.length()<=x.length() && s.equals(x.substring(0,i+1)))
        			temp.add(x);
        	}

        	ans.add(temp);

        }

        return ans;
        
    }
}