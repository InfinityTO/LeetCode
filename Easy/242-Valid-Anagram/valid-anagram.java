//Using Sorting Method
class Solution {
    public boolean isAnagram(String s, String t) {
        char [] scharArray = s.toCharArray();
        char [] tcharArray = t.toCharArray();

        Arrays.sort(scharArray);
        Arrays.sort(tcharArray);

        String sorteds = new String (scharArray);
        String sortedt = new String (tcharArray);

        return sorteds.equals(sortedt) ;
    
    }
}

//Using Frequency Array Approach
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
}