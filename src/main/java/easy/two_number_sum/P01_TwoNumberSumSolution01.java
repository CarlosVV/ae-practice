package easy.two_number_sum;

import util.ArrayUtil;

/*
 *Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.
 * If any two numbers in the input array sum up to the target sum, the function should return them in an array.
 * If no two numbers sum up to the target sum, the function should return an empty array.
 * Assume that there will be at most one pair of numbers summing up to the target sum.
 *Sample input: [3, 5, -4, 8, 11, 1, -1, 6], 10
 * Sample output: [-1, 11]
 * */
public class P01_TwoNumberSumSolution01 {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length - 1; i++) {
            int firstNum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int secondNum = array[j];
                if (firstNum + secondNum == targetSum) {
                    return new int[]{firstNum, secondNum};
                }
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
