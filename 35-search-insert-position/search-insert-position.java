class Solution {
    public int searchInsert(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }
    
    private int search(int[] nums, int target, int start, int end) {
        if (start > end) {
            return start;
        }
        
        int midpunkt = start + (end - start) / 2;
        
        if (nums[midpunkt] == target) {
            return midpunkt;
        }
        
        if (target < nums[midpunkt]) {
            return search(nums, target, start, midpunkt - 1);
        } else {
            return search(nums, target, midpunkt + 1, end);
        }
    }
}