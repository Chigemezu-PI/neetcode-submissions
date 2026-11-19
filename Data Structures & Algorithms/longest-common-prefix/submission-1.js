class Solution {
    /**
     * @param {string[]} strs
     * @return {string}
     */
    longestCommonPrefix(strs) {
        let prefix = strs[0];

        for (let i = 0; i < prefix.length; i++) {
            for (let s of strs.slice(1)) {
                if (i >= s.length || s[i] !== prefix[i]) {
                    return prefix.slice(0, i);
                }
            }
        }

        return prefix;
    }
}