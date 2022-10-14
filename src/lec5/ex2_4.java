package lec5;

import java.util.Arrays;
import java.util.Collections;

/**
 * Сортування масивів
 */
public class ex2_4 {

    public static void main(String[] args) {

        int[] i_arr = {-1,2,-3};
        double[] d_arr = {1,-2,3};
        char[] c_arr = {'b','c','a'};
        boolean[] bul_arr = {false,true,false};
        String[] str = {"st2","st3","st1"};

        System.out.println(
                "\t before sorting:" + "\n" +
                "int " + Arrays.toString(i_arr) + "\n" +
                "double " + Arrays.toString(d_arr) + "\n" +
                "char " + Arrays.toString(c_arr) + "\n" +
                "boolean " + Arrays.toString(bul_arr) + "\n" +
                "String " + Arrays.toString(str) + "\n" );

        //Створення копій масивів перед сортуванням
        int[] i_arr_d = Arrays.copyOf(i_arr,i_arr.length);
        double[] d_arr_d = Arrays.copyOf(d_arr,d_arr.length);
        char[] c_arr_d = Arrays.copyOf(c_arr,c_arr.length);
        boolean[] bul_arr_d = Arrays.copyOf(bul_arr,bul_arr.length);
        String[] str_d = Arrays.copyOf(str,str.length);

        //Сортування масивів
        Arrays.sort(i_arr_d);
        Arrays.sort(d_arr_d);
        Arrays.sort(c_arr_d);
//        Arrays.sort(bul_arr_d);
        Arrays.sort(str_d);

        System.out.println(
                "\t after sorting:" + "\n" +
                "int " + Arrays.toString(i_arr_d) + "\n" +
                "double " + Arrays.toString(d_arr_d) + "\n" +
                "char " + Arrays.toString(c_arr_d) + "\n" +
                "boolean " +  "\n" +
                "String " + Arrays.toString(str_d) + "\n" );
    }
}
