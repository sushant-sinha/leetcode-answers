class Solution {
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {

        HashSet<String> pos=new HashSet<>();
        HashSet<String> neg=new HashSet<>();

        for(String s: positive_feedback){
            pos.add(s);
        }

        for(String s: negative_feedback)
        neg.add(s);

        HashMap<Integer, Integer> score=new HashMap<>();

        int index=0;

        for(String s: report){

            int val=0;

            
            for(String a: s.split(" ")){
                // System.out.println(a);
                if(pos.contains(a))
                val+=3;

                else if(neg.contains(a))
                val-=1;

            }

            score.put(student_id[index++], val);

        }

        List<Integer> orderedList = new ArrayList(); 
		for (var elem : score.entrySet()) orderedList.add(elem.getKey());
		Collections.sort(orderedList, (a, b)->(score.get(a) != score.get(b) ? Integer.compare(score.get(b), score.get(a)) : Integer.compare(a, b))); 

        
		List<Integer> ans = new ArrayList(); 
		for (int i = 0; i < k; ++i) ans.add(orderedList.get(i)); 

        return ans;




    }
}