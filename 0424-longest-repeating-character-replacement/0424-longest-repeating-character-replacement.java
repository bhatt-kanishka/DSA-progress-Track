class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        int[] freq = new int[26];

        for (int right = 0; right < s.length(); right++) {

            // current character ki frequency badhao
            freq[s.charAt(right) - 'A']++;

            // window ke andar maximum frequency
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            // kitne characters replace karne padenge
            int replacements = (right - left + 1) - maxFreq;

            // agar k se zyada replacement chahiye
            if (replacements > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // valid window ki maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}