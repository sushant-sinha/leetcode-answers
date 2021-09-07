class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map < Integer, Integer > map = new HashMap();

        int[] arr = new int[nums2.length];

        Stack < Integer > p = new Stack();
        arr[arr.length - 1] = -1;
        p.push(nums2[nums2.length - 1]);
        for (int i = nums2.length - 2; i >= 0; i--) {

            while (p.size() > 0 && nums2[i] >= p.peek()) {
                p.pop();
            }

            if (p.size() == 0) {
                arr[i] = -1;
            } else {
                arr[i] = p.peek();
            }

            p.push(nums2[i]);

        }
        // arr[arr.length-2]=nums2[nums2.length-1];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], arr[i]);
        }

        int ans[] = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}