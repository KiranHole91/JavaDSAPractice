package collectionsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysPract {

    public static void main(String[] args) {
        // 1. Declaration & initialization
        int[] num = new int[4];                 // default values: 0
        System.out.println("Length: " + num.length);

        num = new int[]{10, 22, 32, 43};
        int[] arr = {5, 3, 9, 1, 7};            // shorthand literal

        // 2. Traversal
        System.out.println("\n-- Traverse --");
        for (int i = 0; i < num.length; i++) {  // index-based
            System.out.print(num[i] + " ");
        }
        System.out.println();
        for (int i : num) {                     // for-each
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(num)); // quick print

        // 3. Access & update
        System.out.println("\n-- Access & Update --");
        System.out.println("num[2] = " + num[2]);
        num[2] = 99;
        System.out.println("After update: " + Arrays.toString(num));

    }
}