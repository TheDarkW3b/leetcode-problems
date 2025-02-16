class Solution {
    public int jump(int[] arr) {
        int jumps = 0;
        int l = 0, r = 0;

        while (r < arr.length - 1) {
            int farthest = 0;

            for (int i = l; i <= r; i++) {
                farthest = Math.max(farthest, arr[i] + i);
            }
            
            l = r + 1;
            r = farthest;
            jumps++;
        }

        return jumps;
    }
}
