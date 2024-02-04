class Solution {
    public int returnToBoundaryCount(int[] nums) {
      int count = 0;
        int hit =0;
        for(int i=0;i<nums.length;i++){
           hit+=nums[i];
            if(hit==0)
                count++;
        }
        return count;
    }
}