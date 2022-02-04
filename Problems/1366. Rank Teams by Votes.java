// to do
// expected solution

// was not able to build the custom sort of the list
// 6ms ( 86.42% ) 41.5mb ( 35.85% )

class Solution {
    public String rankTeams(String[] votes) {
        List<Character> list = new ArrayList<>();
        int m = votes.length;
        int n = votes[0].length();
        
        int[][] arr = new int[26][n]; // one letter per line, n = number of rankings in votes
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[votes[i].charAt(j) - 'A'][j]++;
            }
        }
        
        for(int i=0;i<n;i++){
            list.add(votes[0].charAt(i)); // put all letters in list
        }
            
        list.sort((a, b) -> {
            int[] arrA = arr[a-'A'];
            int[] arrB = arr[b-'A'];
            for(int i=0;i<n;i++){
                if(arrA[i]!=arrB[i]){
                    return arrB[i]-arrA[i]; // ranking order
                }
            }
            
            return a - b; // alphabetic order
        });
        
        return list.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());
    }
}