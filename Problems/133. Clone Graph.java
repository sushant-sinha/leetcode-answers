/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    HashMap<Integer, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        Node ans = new Node();
        if(node == null){
            return null;
        }
        ans.val = node.val;
        visited.put(node.val, ans);
        for(int i=0; i<node.neighbors.size(); i++){
            if(!visited.containsKey(node.neighbors.get(i).val)){
                cloneGraph(node.neighbors.get(i));
            }
        }

        for(int i=0; i<node.neighbors.size(); i++){
            ans.neighbors.add(visited.get(node.neighbors.get(i).val));
        }

        return ans;
    }
}