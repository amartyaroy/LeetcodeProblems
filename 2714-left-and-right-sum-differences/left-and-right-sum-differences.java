class Solution {
    public int[] getPrefixSum(int[] arr){
        int[] pf = new int[arr.length];
        pf[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            pf[i] = pf[i-1] + arr[i];

        }
        return pf;
    }
    public int[] leftRightDifference(int[] nums) {
         int[] pfSum = new int[nums.length];
        int[] lSum = new int[nums.length];
        int[] rSum = new int[nums.length];
        int[] res = new int[nums.length];
        pfSum = getPrefixSum(nums);
        for(int i=0;i<nums.length;i++){
            lSum[i] = pfSum[i]-nums[i];
            rSum[i] = pfSum[nums.length-1] - pfSum[i];
        }

        for(int i=0;i<res.length;i++){
            res[i] = Math.abs(lSum[i] - rSum[i]);
        }

        return res;
       
        
    }
}