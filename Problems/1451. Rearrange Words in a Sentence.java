class Solution {
    public String arrangeWords(String text) {

        TreeMap<Integer, ArrayList<String>> map=new TreeMap<>();

        String ar[]=text.split(" ");

        for(String s:ar){

            int len=s.length();

            if(s.charAt(0)>=65 && s.charAt(0)<=91)
                s=(char)(s.charAt(0)+32)+s.substring(1,len);

            ArrayList<String> temp;

            if(map.containsKey(len)){
                temp=map.get(len);
                temp.add(s);
                map.put(len, temp);

            }

            else{
                temp=new ArrayList<>();
                temp.add(s);
                map.put(len, temp);
            }
        }

        StringBuilder sb=new StringBuilder();

        for(Map.Entry<Integer, ArrayList<String>> e: map.entrySet() ){

            ArrayList<String> list=e.getValue();

            for(String s:list){
                    sb.append(s);
                    sb.append(" ");
                }
        }

        String ans=sb.toString();
        ans=ans.substring(0,ans.length()-1);

        if(ans.charAt(0)>=97 && ans.charAt(0)<=123)
                ans=(char)(ans.charAt(0)-32)+ans.substring(1,ans.length());

        return ans;
        
    }
}