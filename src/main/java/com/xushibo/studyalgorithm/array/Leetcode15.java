package com.xushibo.studyalgorithm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p> 三数之和 </p>
 *
 * 给你一个包含 n 个整数的数组nums，判断nums中是否存在三个元素 a，b，c ，使得a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 *
 * */
public class Leetcode15 {

    public List<List<Integer>> threeSum(int[] nums){
        int n = nums.length;

        //排序:O(nlogn),单调升序
        Arrays.sort(nums);

        //遍历结果{[a,b,c]}
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // 枚举 a
        // first-第一层指针
        for (int first = 0; first < n; ++first) {

            // 去重：需要和上一次枚举的数不相同
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            // c 对应的指针初始指向数组的最右端
            //第三层指针，直接从右边反向遍历
            int third = n - 1;
            //当前first数的负数，如果a+b+c=0.则该值为b+c
            int target = -nums[first];
            // 枚举 b
            //第二层指针，从第一个指针之后开始遍历枚举
            for (int second = first + 1; second < n; ++second) {

                // 同样的逻辑去重：需要和上一次枚举的数不相同
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }

                // 需要保证 b 的指针在 c 的指针的左侧 (b是从小大遍历的，如果c小于b则肯定和之前的遍历的集合重复了)
                while (second < third && nums[second] + nums[third] > target) {
                    --third;
                }
                // 如果指针重合，随着 b 后续的增加
                // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }


}
