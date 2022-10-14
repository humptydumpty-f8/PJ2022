package lec5;

import java.util.Arrays;

/**
 * Ініціалізація і відображення багатовимірних масивів
 */
public class ex3_1 {

    public static void main(String[] args) {

        //Створення масиву 2х4 з ініціалізацією за замовчуванням
        int[][] nums= new int[2][4];
        System.out.println(Arrays.toString(nums));
        System.out.println("nums:");
        System.out.println(Arrays.toString(nums[0]));
        System.out.println(Arrays.toString(nums[1]));

        //Створення і ініціалізація двовимірного масиву
        nums = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8}};
        System.out.println("New nums:");
        System.out.println(Arrays.toString(nums[0]));
        System.out.println(Arrays.toString(nums[1]));

        int[][] nums2 = {
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }};
        System.out.println("nums2:");
        System.out.println(Arrays.toString(nums2[0]));
        System.out.println(Arrays.toString(nums2[1]));

        //Створення і ініціалізація тривимірного масиву
        int nums3[][][] = new int[][][]{
                {
                    {1, 2, 3, 4},
                    {5, 6, }},
                {
                    {10, 12, 13},
                    {11, 20, 30, 50}}};
        System.out.println("nums3:");
        System.out.println(Arrays.toString(nums3[0][0]));
        System.out.println(Arrays.toString(nums3[0][1]));
        System.out.println(Arrays.toString(nums3[1][0]));
        System.out.println(Arrays.toString(nums3[1][1]));

    }
}
