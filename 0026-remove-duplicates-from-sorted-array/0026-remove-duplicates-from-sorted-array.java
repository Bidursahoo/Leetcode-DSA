class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int temp = 0 , track = 0;
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i] != nums[i-1]){
                k++;
                if(track!=0){
                    nums[temp] = nums[i];
                    temp++;
                }
            }
            else{
                if(track != 0){
                    track++;
                }else{
                    temp = i;
                    track++;
                }
                
            }
            // if(nums[])
        }
        return k ;
    }
}