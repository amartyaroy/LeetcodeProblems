/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    len = nums.length
    newSet = new Set(nums)
    for(i=0;i<=len;i++){
        if(!newSet.has(i)){
            return i
        }
    }
};