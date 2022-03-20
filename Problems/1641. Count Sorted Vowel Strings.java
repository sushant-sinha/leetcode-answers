// this was the most exciting answer that I found.... DP/Backtracking could have been used (but was to hard to be implemented by my small brain)

// 0ms ( 100% ) 41.2mb ( 26.47% )

// https://leetcode.com/problems/count-sorted-vowel-strings/discuss/1846288/JAVA-This-is-math-problem...-Repeated-combination-formula-100-than-others

// the math's reference is from : https://www.superprof.co.uk/resources/academic/maths/probability/combinatorics/combinations-with-repetition.html

class Solution {
    public int countVowelStrings(int z) {
        return (z + 1) * (z + 2) * (z + 3) * (z + 4) / 24;
    }
}