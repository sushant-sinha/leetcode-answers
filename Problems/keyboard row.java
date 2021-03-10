// SUSHANT SINHA

class Solution {
    public String[] findWords(String[] words) {
        ArrayList<Character> map1 = new ArrayList<Character>();
        ArrayList<Character> map2 = new ArrayList<Character>();
        ArrayList<Character> map3 = new ArrayList<Character>();
        char[] ch1 = {'q','w','e','r','t','y','u','i','o','p','Q','W','E','R','T','Y','U','I','O','P'};
        char[] ch2 = {'a','A','s','S','d','D','F','f','G','g','h','H','J','j','K','k','l','L'};
        char[] ch3 = {'z','Z','x','X','C','c','v','V','b','B','n','N','m','M'};

        // Or use Arrays.asList

        for(char c : ch1) map1.add(c);
        for(char c : ch2) map2.add(c); 
        for(char c : ch3) map3.add(c);
        ArrayList<String> list = new ArrayList<String>();
        for(String s : words) {
            boolean b = false;;
            if (map1.contains(s.charAt(0))) {
                for (int i = 1; i < s.length(); i ++)
                    if (!map1.contains(s.charAt(i))) {
                        b = true;
                        break;
                    }
            }
            else if (map2.contains(s.charAt(0))) {
                for (int i = 1; i < s.length(); i ++)
                    if (!map2.contains(s.charAt(i))) {
                        b = true;
                        break;
                    }
            }
            else {
                for (int i = 1; i < s.length(); i ++)
                    if (!map3.contains(s.charAt(i))) {
                        b = true;
                        break;
                    }
            }
            if (!b)
                list.add(s);
        }
        
        String[] s1 = new String[list.size()];
        s1 = list.toArray(s1);
        return s1;
    }
}