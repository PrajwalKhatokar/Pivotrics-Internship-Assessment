package Pivotrics;

import java.util.Scanner;
import java.util.*;

public class SortCharactersbyFrequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        String output = frequencySort(s);

        System.out.println("Sorted by frequency:");
        System.out.println(output);

        sc.close();
    }
        public static String frequencySort(String s) {

            Map<Character, Integer> freqMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }

            List<Character> chars = new ArrayList<>(freqMap.keySet());
            chars.sort((a, b) -> freqMap.get(b) - freqMap.get(a));

            StringBuilder result = new StringBuilder();
            for (char c : chars) {
                int count = freqMap.get(c);
                for (int i = 0; i < count; i++) {
                    result.append(c);
                }
            }
            return result.toString();
        }

    }
//
//test case 1:
//
//Enter the string: tree
//Sorted by frequency:
//eert


//test case 2:
//
//Enter the string: cccaaa
//Sorted by frequency:
//aaaccc

////test case 3:
//Enter the string: Aabb
//Sorted by frequency:
//bbAa


