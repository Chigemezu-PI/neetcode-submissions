/**

class Solution {
    public boolean isAnagram(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                //its 0 this time not one becuase we are checking the same index in both strings, rather than the if the duplicates apear in the previous code

                //regex to check if they match in some way, but forgot how to do ergex (well I got like 10.5 months till im back in 4th year so we good)
            }
        }

    }
}

/**/

class Solution {
    public boolean isAnagram(String s, String t) {

        // 1. Check string lengths
        if (s.length() != t.length()) {
            return false;
        }

        // 2. Create frequency array
        int[] count = new int[26];

        // 3. Count characters in s
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // 4. Subtract characters in t
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        // 5. Check frequencies
        for (int frequency : count) {
            if (frequency != 0) {
                return false;
            }
        }

        return true;
    }
}