class Solution {
    public int singleNumber(int[] nums) {
        
        int numbercount = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            numbercount ^= nums[i];
        }
        
        return numbercount;
        
    }
}
