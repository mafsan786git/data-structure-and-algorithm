class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0,maxCount=0;
        for(int val : nums){
            map.put(val,map.getOrDefault(val,0) + 1);

            if(map.get(val) > maxCount){
                maxCount = map.get(val);
                res = val;
            }
        }

        return res;

    }
}