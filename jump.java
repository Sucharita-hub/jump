class jump {
    public static boolean canReachLastIndex(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false; // If we can't reach this index, return false
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return true; // If we can reach or exceed the last index, return true
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 }; // Example input
        System.out.println(canReachLastIndex(nums)); // Output: true
    }
}
