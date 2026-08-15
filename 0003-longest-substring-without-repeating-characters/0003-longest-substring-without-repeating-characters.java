class Solution {
public int lengthOfLongestSubstring(String s) {
HashSet<Character> set = new HashSet<>();

int cnt = 0, count = 0;
int i = 0, j = 0;

while (j < s.length()) {

while (set.contains(s.charAt(j))) {
set.remove(s.charAt(i));
cnt--;
i++;
}

set.add(s.charAt(j));
cnt++;

count = Math.max(count, cnt);
j++;
}

return count;
}
}
