class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        for (int i = 0; i < nums.length; i++) {
            //im still thinking gimme a sec ;/
            for (int j = i + 1; j < nums.length; j++) {
                //pretty sure this is a nested loop
                //I believe you add a i + 1 to ensure J is the next character/number
                //if i is the first index and so is J it'll be checking for the wrong thing.
                //hence why j start at the character/number right of it/next
                if (nums[i] == nums[j]) {
                    return true;
                }

                //else return false;

            }
        }

        return false;


        //any pair, dmeans were matching two values therefore we using a nested loop
        // any paid that matces return a true
        //else false
        //You can match using the same index? CharAt(i), but for numbers its?
    }
}