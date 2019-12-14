package easy.two_number_sum;

import util.ArrayUtil;

import java.util.HashMap;
import java.util.Map;

/*
 *Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.
 * If any two numbers in the input array sum up to the target sum, the function should return them in an array.
 * If no two numbers sum up to the target sum, the function should return an empty array.
 * Assume that there will be at most one pair of numbers summing up to the target sum.
 *Sample input: [3, 5, -4, 8, 11, 1, -1, 6], 10
 * Sample output: [-1, 11]
 * */
public class P01_TwoNumberSumSolution02 {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Map<Integer, Boolean> nums = new HashMap<>();
        for (int num : array) {
            int potentialMatch = targetSum - num;
            if (nums.containsKey(potentialMatch)) {
                return new int[]{potentialMatch, num};
            } else {
                nums.put(num, true);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {

        System.out.println("P01_TwoNumberSumSolution01:");
        System.out.println("Input: [3, 5, -4, 8, 11, 1, -1, 6], 10");
        System.out.println("Output: " + ArrayUtil.printIntArray(twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10)));
    }
}
