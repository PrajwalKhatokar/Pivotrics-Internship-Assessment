package Pivotrics;

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Scanner;

public class LastStoneWeight {

    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            pq.add(stone);
        }
        while (pq.size() > 1) {
            int y = pq.poll();
            int x = pq.poll();

            if (y != x) {
                pq.add(y - x);
            }
        }

        return pq.isEmpty() ? 0 : pq.peek();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stones: ");
        int n = sc.nextInt();

        int[] stones = new int[n];

        System.out.println("Enter stone weights:");
        for (int i = 0; i < n; i++) {
            stones[i] = sc.nextInt();
        }

        int result = lastStoneWeight(stones);

        System.out.println("Last stone weight: " + result);

        sc.close();
    }
}

//test case 1:
//
//Enter number of stones: 2
//Enter stone weights:
//        1 2
//Last stone weight: 1