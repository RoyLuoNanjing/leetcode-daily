package leetcode.medium.Q43_MultiplyStrings;

public class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];

        // 逐位相乘
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); // 数字相乘
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + result[p2];

                result[p1] += sum / 10;
                result[p2] = sum % 10;
            }
        }

        // 将结果转换为字符串
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // 跳过前导零
                sb.append(num);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();

    }
}