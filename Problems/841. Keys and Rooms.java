// SUSHANT SINHA

// tired using ArrayList instead of stack

// given solution
// 1ms ( 85.85% ) 38.7mb ( 85.76% )

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;
        Stack<Integer> stack = new Stack();
        stack.push(0);

        //At the beginning, we have a todo list "stack" of keys to use.
        //'seen' represents at some point we have entered this room.
        while (!stack.isEmpty()) { // While we have keys...
            int node = stack.pop(); // Get the next key 'node'
            for (int nei: rooms.get(node)) // For every key in room # 'node'...
                if (!seen[nei]) { // ...that hasn't been used yet
                    seen[nei] = true; // mark that we've entered the room
                    stack.push(nei); // add the key to the todo list
                }
        }

        for (boolean v: seen)  // if any room hasn't been visited, return false
            if (!v) return false;
        return true;
    }
}


class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visitedRooms = new boolean[rooms.size()];
        moveBetweenRooms(rooms, 0, visitedRooms);
        
        for(boolean isRoomVisited: visitedRooms) {
            if(!isRoomVisited) {
                return false;
            }
        }
        
        return true;
    }
    
    private void moveBetweenRooms(List<List<Integer>> rooms, int curRoom, boolean[] visitedRooms) {
        
        if(visitedRooms[curRoom]) {
            return;
        }
        visitedRooms[curRoom] = true;
        List<Integer> accessibleRooms = rooms.get(curRoom);
        for(int room: accessibleRooms) {
            moveBetweenRooms(rooms, room, visitedRooms);
        }
    }
}