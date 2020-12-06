// SUSHANT SINHA

// This method is faster and takes 0.8 mb more space than later code.


/*  
    Used this method as the length of the string was only 4 ....

    If the length would have been more it will be difficult to write all cases from 0 to n

*/



class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans=new ArrayList<String>();
        if(digits.length()==0)return ans;
        String add[]=new String[digits.length()];
        for(int i=0;i<digits.length();i++){
            switch(digits.substring(i,i+1)){
                case "2":
                    add[i]="abc";break;
                case "3":
                    add[i]="def";break;
                case "4":
                    add[i]="ghi";break;
                case "5":
                    add[i]="jkl";break;
                case "6":
                    add[i]="mno";break;
                case "7":
                    add[i]="pqrs";break;
                case "8":
                    add[i]="tuv";break;
                case "9":
                    add[i]="wxyz";break;
            }
        }
        if(add.length==1){
            for(int i=0;i<add[0].length();i++){
                ans.add(add[0].substring(i,i+1));
            }
            return ans;
        }
        if(add.length==4){
                for(int j=0;j<add[0].length();j++){
                   
                    
                    for(int k=0;k<add[1].length();k++){
                        
                        for(int l=0;l<add[2].length();l++){
                            for(int m=0;m<add[3].length();m++){
                             StringBuilder sb=new StringBuilder();
                            sb.append(add[0].substring(j,j+1));
                            sb.append(add[1].substring(k,k+1));
                            sb.append(add[2].substring(l,l+1));
                            sb.append(add[3].substring(m,m+1));
                            ans.add(sb.toString());
                        }
                    }
                }
            }
            return ans;
        }
        
        if(add.length==2){
            for(int j=0;j<add[0].length();j++){
                    
                    for(int k=0;k<add[1].length();k++){
                        StringBuilder sb=new StringBuilder();
                        sb.append(add[0].substring(j,j+1));
                        sb.append(add[1].substring(k,k+1));
                        ans.add(sb.toString());
                    }
                }
        
            return ans;
        }
        if(add.length==3){
                for(int j=0;j<add[0].length();j++){
                   
                    
                    for(int k=0;k<add[1].length();k++){
                        
                        for(int l=0;l<add[2].length();l++){
                             StringBuilder sb=new StringBuilder();
                            sb.append(add[0].substring(j,j+1));
                            sb.append(add[1].substring(k,k+1));
                            sb.append(add[2].substring(l,l+1));
                            ans.add(sb.toString());
                    }
                }
                }
            
            return ans;
        }
        return ans;
    }
}

// This method is slower but less memory(not considerable);

public class Solution {
    /**
     * @param digits A digital string
     * @return all posible letter combinations
     */
    public ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> rst = new ArrayList<String>();
        if (digits == null || digits.length() == 0) {
            return rst;
        }
        ArrayList<String[]> map = new ArrayList<String[]>();
        map.add(new String[]{});//key 0: nothing
        map.add(new String[]{});//key 1: nothing
        map.add(new String[]{"a","b","c"});
        map.add(new String[]{"d","e","f"});
        map.add(new String[]{"g","h","i"});
        map.add(new String[]{"j","k","l"});
        map.add(new String[]{"m","n","o"});
        map.add(new String[]{"p","q","r","s"});
        map.add(new String[]{"t","u","v"});
        map.add(new String[]{"w","x","y","z"});

        ArrayList<String> list = new ArrayList<String>();
        helper(rst, list, map, digits, 0);

        return rst;
    }

    public void helper(ArrayList<String> rst, ArrayList<String> list, 
        ArrayList<String[]> map, String digits, int level){
        //If level is finished, compress into string
        if (level == digits.length()) {
            StringBuffer sb = new StringBuffer();
            for (String s : list) {
                sb.append(s);
            }
            rst.add(sb.toString());
            return;
        }
        //For a specific list of candidates, face the level of chars
        int num = Integer.parseInt(digits.substring(level, level + 1));
        String[] strs = map.get(num);

        for (int i = 0; i < strs.length; i++) {
            list.add(strs[i]);
            helper(rst, list, map, digits, level + 1);
            list.remove(list.size() - 1);
        }
    }

}
