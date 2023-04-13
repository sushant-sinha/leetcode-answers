// couldn't solve
// should have used stack instead of two arraylists

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int len = pushed.length;

        Stack<Integer> stack = new Stack();

        int j = 0;
        for (int x: pushed) {

            stack.push(x);

            // checking after every insertion if we can pop or not
            while (!stack.isEmpty() && j < len && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }

        return j == len;
    }
}