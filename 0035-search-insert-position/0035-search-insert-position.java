class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=1;i<=nums.length;i++){
            if(nums[i-1]==target){
                return i-1;
            }
            else if(nums[i-1]<target){
                if(i<nums.length && nums[i]>target){
                     return i;

                }
                
            }
        }
        if(target<=nums[0]){
            return 0;
        }
        else{
            return nums.length;
        }
}
}