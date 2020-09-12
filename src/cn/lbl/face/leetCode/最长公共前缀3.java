package cn.lbl.face.leetCode;

public class 最长公共前缀3 {

    //这个是使用了纵向比较的方法
        public static String longestCommonPrefix(String[] strs) {
            //如果trs字符数组为空或长度为0,则没有公共前缀，返回""
            if (strs == null || strs.length == 0) {
                return "";
            }

            //获取strs数组中第一个字符串的长度
            int length = strs[0].length();
            //获取strs字符串数组的长度,即字符串个数
            int count = strs.length;
            //循环判断条件，length，即strs数组中第一个字符串的长度
            for (int i = 0; i < length; i++) {
                //获取strs数组中第一个字符串的第i个字符
                char c = strs[0].charAt(i);
                //遍历strs中除第一个字符串的其他字符串
                for (int j = 1; j < count; j++) {
                    //1.判断strs中第j个字符串的长度是否是i相等
                    //2.判断strs中第j个字符串的第i个字符是否和c相等
                    if (i == strs[j].length() || strs[j].charAt(i) != c) {
                        //如果相等，当截取0到(i-1)个字符，然后返回
                        return strs[0].substring(0, i);
                    }
                }
            }
            //如果循环中没有返回，则说明都相等，所以返回自己
            return strs[0];
        }

    public static void main(String[] args) {
        String[] strings = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strings));
    }
    }
