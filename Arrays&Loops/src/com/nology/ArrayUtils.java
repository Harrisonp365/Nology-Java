package com.nology;

public class ArrayUtils {

    public static int[] incriment(int[] arr) {

        for(int i = 0; i < arr.length; i++)
            arr[i] += 1;

        return arr;
    }
}
