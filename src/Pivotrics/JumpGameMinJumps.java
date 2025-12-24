package Pivotrics;

import java.util.Scanner;

public class JumpGameMinJumps {

    public static int jump(int[] nums) {

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = jump(nums);

        System.out.println("Minimum number of jumps: " + result);

        sc.close();
    }
}
//
//test case 1:
//
//Enter array size: 6
//Enter array elements:
//        2 4 1 1 1 1
//Minimum number of jumps: 2
//
//test case 2:
//Enter array size: 5
//Enter array elements:
//        2 1 2 1 0
//Minimum number of jumps: 2