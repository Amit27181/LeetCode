class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int mid = findIndexOfMax(height, n);
        int left = 0;
        int right = 0;
        int wt = 0;
        for (int i = 0; i <= mid; i++) {
            if (height[i] > left) {
                left = height[i];
            }
            wt += Math.min(left, height[mid]) - height[i];
        }
        for (int j = n - 1; j >= mid; j--) {
            if (height[j] > right) {
                right = height[j];
            }
            wt += Math.min(right, height[mid]) - height[j];
        }
        return wt;
    }
    public int findIndexOfMax(int[] height, int n) {
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (height[i] > height[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}