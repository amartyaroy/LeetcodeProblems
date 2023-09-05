/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    for(i=0;i<nums.length;i++){
        if((nums[i] == target) || (target < nums[i])){
            return i
        }
        if(target < nums[i+1]){
            return (i+1)
        }
        if(target > nums[nums.length - 1]){
            return (nums.length)
        }
    }
};