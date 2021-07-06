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

// better solution made just by using StringBuilder for generating the answer string in the final for-each loop
// 8ms ( 97.32% ) 39.7mb ( 83.44% )

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

			StringBuilder sb = new StringBuilder();

			sb.append(e.getValue());
			sb.append(" ");
			sb.append(e.getKey());
			
			ans.add(sb.toString());

		}

		return ans;

	}
}

// best solution according to 
// 13ms ( 91.50% ) 47.4mb ( 12.62% )

class Solution {
	HashMap<String,Integer> counts = new HashMap<>(); 
	public List<String> subdomainVisits(String[] cpdomains) {
		for(String cpdomain : cpdomains){
			processor(cpdomain);        
		}
		List<String> result = new ArrayList<>();
		for(Map.Entry<String,Integer> entry : counts.entrySet()){
			StringBuilder sb = new StringBuilder();
			sb.append(entry.getValue());
			sb.append(" ");
			sb.append(entry.getKey());
			result.add(sb.toString());
			
		}
		
		return result;
	}
	
	
	public void processor(String s){
		int domaincount = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == ' '){
				String link = s.substring(i+1);
				domaincount = Integer.parseInt(s.substring(0,i));
				counts.put(link,counts.getOrDefault(link,0)+domaincount);
			}
			if(s.charAt(i) == '.'){
				String link = s.substring(i+1);
				counts.put(link,counts.getOrDefault(link,0)+domaincount);
			}
		}
	}
}