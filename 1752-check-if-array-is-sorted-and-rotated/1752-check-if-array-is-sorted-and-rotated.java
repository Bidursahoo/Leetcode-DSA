class Solution {
    public boolean check(int[] nums) {
        int a = 0;
        int b = 0;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] <= nums[(i+1) % nums.length] ){
                a++;
            }else{
                b++;
            } 
        }
        return (b <= 1) ? true : false;
    }
}