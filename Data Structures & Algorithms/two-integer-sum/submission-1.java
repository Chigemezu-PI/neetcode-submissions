class Solution {
    public int[] twoSum(int[] nums, int target) {



        //check if the combination of the index matches the array

        //initialising i and j, the boundareies, ensuring that i is index 0 and j is always 1 index more
        //than i, so as they iterate through the code, that its always adjacent to i, i.e 0,1... 6,7

        int counti = 0;
        int countj = 1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {

                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
        
    }
}
