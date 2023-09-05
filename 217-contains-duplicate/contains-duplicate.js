/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    let ar = new Set()
    for(i=0;i<nums.length;i++){
        if(ar.has(nums[i])){
           return true
        }else{
            ar.add(nums[i])    
        }
        
        
        
    }
    return false
};