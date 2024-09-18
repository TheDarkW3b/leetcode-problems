class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        Collections.reverse(Arrays.asList(arr));
        s = String.join(" ", arr);
        return s.trim();
    }
}
