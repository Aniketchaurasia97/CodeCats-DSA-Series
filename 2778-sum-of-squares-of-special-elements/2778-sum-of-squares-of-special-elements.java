class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sumofsquare=0;
        for(int i=0;i<n;i++){
            if(n%(i+1)==0){
                sumofsquare+= Math.pow(nums[i],2);
            }
        }
        return sumofsquare;
    }
}