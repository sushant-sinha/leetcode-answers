// SUSHANT SINHA

// 17ms ( 58.82% ) 40mb ( 59.11% )

class Solution {
	public List<String> subdomainVisits(String[] cpdomains) {

		ArrayList<String> ans=new ArrayList<>();

		HashMap<String,Integer> map = new HashMap<>();

		for(String s:cpdomains){

			int a=Integer.parseInt(s.split(" ")[0]);

			String sb=s.split(" ")[1];

			if(map.containsKey(sb))
				map.put(sb, map.get(sb)+a);
			else
				map.put(sb,a);

			String ar[]=sb.split("\\.",2);

			while(ar.length>1){

				if(map.containsKey(ar[1]))
					map.put(ar[1], map.get(ar[1])+a);
				
				else
					map.put(ar[1],a);

				ar=ar[1].split("\\.",2);

			}

		}

		for(Map.Entry e : map.entrySet()){

			String key=(String)e.getKey();

			ans.add(map.get(key)+" "+key);

		}

		return ans;

	}
}