class Solution {
    public boolean containsDuplicate(int[] nums) {
        // First I will sort the array so that I can compare nth index with n+1th index. If any of them is equal, returns true.
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
