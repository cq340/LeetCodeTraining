package February;


/**
 * class Solution:
 *     def numberOfSubstrings(self, s: str) -> int:
 *         i = 0
 *         j = i+3
 *
 *         if len(s) <= 2:
 *             return 0
 *         out = 0
 *         while i < len(s)-2:
 *             if 'a' in s[i:j] and 'b' in s[i:j] and 'c' in s[i:j]:
 *                 out += (len(s)-j + 1)
 *                 i+=1
 *                 if j < i+3:
 *                     j = i+3
 *             else:
 *                 j+=1
 *                 if j > len(s):
 *                     break
 *         return out
 *
 * 作者：zeoxc
 * 链接：https://leetcode-cn.com/problems/number-of-substrings-containing-all-three-characters/solution/shuang-zhi-zhen-yi-bian-guo-by-zeoxc/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */


public class number5325 {
    /**
     * class Solution:
     *     def numberOfSubstrings(self, s: str) -> int:
     *         i = 0
     *         j = i+3
     *
     *         if len(s) <= 2:
     *             return 0
     *         out = 0
     *         while i < len(s)-2:
     *             if 'a' in s[i:j] and 'b' in s[i:j] and 'c' in s[i:j]:
     *                 out += (len(s)-j + 1)
     *                 i+=1
     *                 if j < i+3:
     *                     j = i+3
     *             else:
     *                 j+=1
     *                 if j > len(s):
     *                     break
     *         return out
     *
     * 作者：zeoxc
     * 链接：https://leetcode-cn.com/problems/number-of-substrings-containing-all-three-characters/solution/shuang-zhi-zhen-yi-bian-guo-by-zeoxc/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
}
