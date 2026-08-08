class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> obj = new ArrayList<>();

        // If p is bigger than s, anagram possible nahi hai
        if (p.length() > s.length()) {
            return obj;
        }

        int left = 0;
        int right = p.length() - 1;

        int[] windowfreq = new int[26];
        int[] pfreq = new int[26];

        // Frequency of p
        for (int i = 0; i < p.length(); i++) {
            pfreq[p.charAt(i) - 'a']++;
        }

        // First window
        for (int i = 0; i < p.length(); i++) {
            windowfreq[s.charAt(i) - 'a']++;
        }

        while (right < s.length()) {

            // Check current window
            if (Arrays.equals(pfreq, windowfreq)) {
                obj.add(left);
            }

            // Remove left character
            windowfreq[s.charAt(left) - 'a']--;

            // Move window
            left++;
            right++;

            // Add new right character
            if (right < s.length()) {
                windowfreq[s.charAt(right) - 'a']++;
            }
        }

        return obj;
    }
}