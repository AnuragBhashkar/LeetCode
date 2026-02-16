class Solution {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            Map<Character, Integer> mp = new HashMap<>();
            int unique = 0;
            int atLeastK = 0;

            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                mp.put(ch, mp.getOrDefault(ch, 0) + 1);

                // New character
                if (mp.get(ch) == 1) {
                    unique++;
                }

                // Character just reached k frequency
                if (mp.get(ch) == k) {
                    atLeastK++;
                }

                // Valid substring check (O(1))
                if (unique == atLeastK) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}
