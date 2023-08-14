public class Solution {
    public int SingleNumber(int[] nums) {
        
        int number = 0;
        
        for(int i = 0; i < nums.Length; i++)
        {
            number ^= nums[i];
        }
        
        return number;
        
    }
}
