package Pivotrics;

import java.util.Scanner;

public class AddTwoNumbers {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }

    public static ListNode createList(Scanner sc, int n) {
        ListNode head = null, tail = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ListNode node = new ListNode(val);

            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        return head;
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first list: ");
        int n1 = sc.nextInt();
        System.out.println("Enter elements of first list:");
        ListNode l1 = createList(sc, n1);

        System.out.print("Enter size of second list: ");
        int n2 = sc.nextInt();
        System.out.println("Enter elements of second list:");
        ListNode l2 = createList(sc, n2);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.println("Sum list:");
        printList(result);

        sc.close();
    }
}
//
//test case 1:
//Enter size of first list: 3
//Enter elements of first list:
//        1 2 3
//Enter size of second list: 3
//Enter elements of second list:
//        4 5 6
//Sum list:
//        5 7 9
//
//test case 2:
//Enter size of first list: 1
//Enter elements of first list:
//        9
//Enter size of second list: 1
//Enter elements of second list:
//        9
//Sum list:
//        8 1