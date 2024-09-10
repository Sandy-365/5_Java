/*
136. Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1
 
Constraints:
1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
 */

// 1 : sort the data check one left and one right value if matches then false else true
class Solution {
    public int singleNumber(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        if(nums.size()==1){
            return nums[0];
        }

        int i=1;
        while(true){
            cout<<nums[i-1]<<"   "<<nums[i]<<"  ";
            if(nums[i-1]==nums[i]){
                i+=2;
                continue;
            }
            else{
                return nums[i-1];
            }
        }
        return 0;
    }
}

    // 2 : use loop to check done in cpp
    class Solution {
    public int singleNumber(vector<int>& nums) {
        if(nums.size()==1){
            return nums[0];
        }
        for(int i = 0 ;i<nums.size();i++){
            // left
            int cnt=0;
            for(int j=i-1;j>=0;j--){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            // right
            for(int k=i+1;k<nums.size();k++){
                if(nums[i]==nums[k]){
                    cnt++;
                }
            }
            if(cnt==0){
                return nums[i];
            }
        }
        return 0;

     }
}

        // Bit Manipulation
class Solution {
    public int singleNumber(int[] nums) {
        int xor =0;
        for(int i=0;i<nums.length;i++){
            xor = xor^nums[i]; 
        }
        return xor;
    }
}