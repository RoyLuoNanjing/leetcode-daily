package leetcode.easy.Q3285_FindIndicesOfStableMoutains;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                res.add(i);
            }
        }

        return res;
    }
}