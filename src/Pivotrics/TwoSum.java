package Pivotrics;
import java.util.Scanner;
public class TwoSum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            int[] nums = new int[n];

            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            System.out.print("Enter target: ");
            int target = sc.nextInt();

            int[] result = twoSum(nums, target);

            System.out.println("Output:");
            System.out.println("[" + result[0] + ", " + result[1] + "]");

            sc.close();
        }

        public static int[] twoSum(int[] nums, int target) {

            int n = nums.length;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[]{};
        }
    }
//
//test case 1:
//
//Enter number of elements: 4
//Enter array elements:
//        3 4 5 6
//Enter target: 7
//Output:
//        [0, 1]

//test case 2:
//
//Enter number of elements: 3
//Enter array elements:
//        4 5 6
//Enter target: 10
//Output:
//        [0, 2]


//test case 3:
//
//Enter number of elements: 2
//Enter array elements:
//        5 5
//Enter target: 10
//Output:
//        [0, 1]
