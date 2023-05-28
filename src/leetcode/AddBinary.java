package leetcode;

/**
 * 67. 二进制求和
 * 给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入:a = "11", b = "1"
 * 输出："100"
 * 示例 2：
 * <p>
 * 输入：a = "1010", b = "1011"
 * 输出："10101"
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= a.length, b.length <= 104
 * a 和 b 仅由字符 '0' 或 '1' 组成
 * 字符串如果不是 "0" ，就不含前导零
 */
public class AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String result = addBinary(a, b);
        System.out.println(result);
    }

    private static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            return addBinary(b, a);
        }
        int n = a.length();
        int m = b.length();
        if (m == 0) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = n - 1, j = m - 1; i >= 0; i--, j--) {
            if (a.charAt(i) == '1') {
                carry++;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                carry++;
            }
            if (carry % 2 == 1) {
                sb.append('1');
            } else {
                sb.append('0');
            }
            carry /= 2;
        }
        if (carry == 1) {
            sb.append('1');
        }
        sb.reverse();
        return sb.toString();

    }
}
