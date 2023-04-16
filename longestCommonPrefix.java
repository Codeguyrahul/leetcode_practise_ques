package leetcode_Question;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        String[] strs3 = {"hello", "heaven", "hearth"};

        System.out.println(longestCommonPrefix(strs1)); // Output: "fl"
        System.out.println(longestCommonPrefix(strs2)); // Output: ""
        System.out.println(longestCommonPrefix(strs3)); // Output: "he"
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
