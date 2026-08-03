class Solution {
    public void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public String reversePrefix(String s, int k) {
        char[] arr = s.toCharArray();
        reverse(arr, 0, k-1);
        return new String(arr);
    }
}
