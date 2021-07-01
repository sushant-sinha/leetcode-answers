// SUSHANT SINHA

// 5ms ( 73.75% ) 46.3mb ( 67.34% )

class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for(int i = 0; i < n; i++) {
            int s = 1 << i;
            
            for(int j = list.size() - 1; j >= 0; j--){
                list.add(s + list.get(j));
            }
            
        }
        return list;
    }
}