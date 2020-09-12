package cn.lbl.face.leetCode;

public class 最长公共前缀2 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String ans = strs[0];
        for(int i =1;i<strs.length;i++) {
            int j=0;
            for(;j<ans.length() && j < strs[i].length();j++) {
                if(ans.charAt(j) != strs[i].charAt(j))
                    break;
            }
            ans = ans.substring(0, j);
            if(ans.equals(""))
                return ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"flower","flow","flight"};
        longestCommonPrefix(strings);
    }
}
