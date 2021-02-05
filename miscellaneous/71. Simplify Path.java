// SUSHANT SINHA

class Solution {
    public String simplifyPath(String path) {
        String[] dirs = path.split("/");
        Deque<String> q = new ArrayDeque<>();
        for(String s: dirs) {
            if(s.equals("")) continue;
            if(s.equals(".")) continue;
            if(s.equals("..")) q.pollLast();
            else q.add(s);
        }
        return "/" + String.join("/", q);
    }
}