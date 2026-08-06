class Solution {
    public int majorityElement(int[] nums) {
        int res = 0, count = 0;

        for(int val : nums){
            if(count == 0){
                res = val;
            }

            count += (res == val) ? 1 : -1;
        }

        return res;
    }
}