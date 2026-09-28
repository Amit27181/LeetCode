class Solution {
    public int maxDepth(String s) {
        int ans = 0, depth = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
              depth += 1;
                } else if (ch == ')') {
                    depth -= 1;
                    } else {
                        depth += 0;
                        }
            ans = Math.max(ans, depth);
        }
        return ans;
    }
}