// SUSHANT SINHA

// try check once
// 5ms ( 57.36% ) 38.9mb ( 80.53% )

class Solution {
    public String simplifyPath(String path) {
        String[] dirs = path.split("/");
        Deque<String> ans = new ArrayDeque<>();
        for(String s: dirs) {
            if(s.equals("")) continue;
            if(s.equals(".")) continue;
            if(s.equals("..")) ans.pollLast();
            else ans.add(s);
        }
        return "/" + String.join("/", ans);
    }
}