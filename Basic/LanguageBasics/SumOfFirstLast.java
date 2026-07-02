package Basic.LanguageBasics;

import java.util.Scanner;

public class SumOfFirstLast {

    public static int sumMethod(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        return nums[0] + nums[nums.length - 1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Sum = " + sumMethod(nums));

        sc.close();
    }
}