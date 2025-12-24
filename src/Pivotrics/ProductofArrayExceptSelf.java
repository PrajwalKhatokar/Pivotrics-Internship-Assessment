package Pivotrics;

import java.util.Scanner;

public class ProductofArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * right;
            right *= nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = productExceptSelf(nums);

        System.out.println("Product of array except self:");
        for (int val : result) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}

//test case 1:
//
//Enter size of array: 4
//Enter array elements:
//        1 2 4 6
////Product of array except self:
//        48 24 12 8

//test case 2 :

//Enter size of array: 5
//Enter array elements:
//        -1 0 1 2 3
//Product of array except self:
//        0 -6 0 0 0