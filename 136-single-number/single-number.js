/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let res = new Set()
    for(i=0;i<nums.length;i++){
        if(!res.has(nums[i])){
            res.add(nums[i])
        }else{
            res.delete(nums[i])
        }
    }
   return [...res]
};