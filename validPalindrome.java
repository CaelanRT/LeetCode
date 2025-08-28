class Solution {
    public boolean isPalindrome(String s) {
        String u = s.toLowerCase();
        String t = u.replaceAll("[^a-zA-Z0-9]", "");
        char[] c = t.toCharArray();
        int j = 0;
        
        boolean returnValue = false;

        if (c.length == 0){
                return true;
        }

        for (int i = c.length-1; i >= 0; --i) {
            if (c[i] != c[j]) {
                return false;
            } else {
                returnValue = true;
            }
            ++j;
            
        }
        return returnValue;
    }
}
