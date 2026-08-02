class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int i = 0, j = nums.length - 1;
        int len = 0;

        while(i <= j){
            while( i <= j && nums[i] != val){
	            i++;
	            len++;
            } 

            while( i <= j && nums[j] == val){
                j--;
            } 
            if(i <= j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
                len++;
            }
        }
        return len;
    }
}