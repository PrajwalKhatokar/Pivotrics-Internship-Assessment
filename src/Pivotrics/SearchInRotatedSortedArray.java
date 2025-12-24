package Pivotrics;

import java.util.Scanner;

public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
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

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int result = search(nums, target);

        System.out.println("Output: " + result);

        sc.close();
    }
}

//test case 1:
//Enter array size: 6
//Enter array elements:
//        3 4 5 6 1 2
//Enter target: 1
//Output: 4

//test case 2:
//Enter array size: 6
//Enter array elements:
//        3 5 6 0 1 2
//Enter target: 4
//Output: -1