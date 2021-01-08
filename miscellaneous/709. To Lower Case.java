// SUSHANT SINHA

// original answer

class Solution {
    public String toLowerCase(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if ((int) c <= 90 && (int) c >= 65) {
                result.append((char)(c+32));
            } 
            else {
            result.append(c);
            }
        }
        
        return result.toString();

    }
}

// my answer

class Solution {
    public String toLowerCase(String str) {

    	return str.toLowerCase();
    }
}