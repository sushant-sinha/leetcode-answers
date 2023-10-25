class Solution {
    public List<List<String>> findDuplicate(String[] paths) {

        // mapping content with the absolute path

        HashMap<String, ArrayList<String>> map=new HashMap<>();

        for(String s: paths){
            
            String ar[]=s.split(" ");

            String root=ar[0];

            for(int i=1; i<ar.length;i++){

                String fileName=ar[i].substring(0,ar[i].indexOf("("));
                String content=ar[i].substring(ar[i].indexOf("("),ar[i].length());

                // System.out.println("fileName = "+fileName+" content="+content);

                if(map.containsKey(content)){
                    ArrayList<String> temp=map.get(content);
                    temp.add(root+"/"+fileName);
                    map.put(content, temp);
                }
                else{
                    ArrayList<String> temp=new ArrayList<>();
                    temp.add(root+"/"+fileName);
                    map.put(content, temp);
                }

            }
        }

        List<List<String>> ans= new ArrayList<>();

        for(Map.Entry<String,ArrayList<String>> e: map.entrySet()){
            // System.out.println(e.getKey()+ " "+e.getValue());

            if(e.getValue().size()>1)
            ans.add(e.getValue());
        }

        return ans;
        
    }
}