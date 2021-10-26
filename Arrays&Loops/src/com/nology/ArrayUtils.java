package com.nology;

//Create a class called ArrayUtils
//        Create a static method that takes in an int[]
//        ... and returns a new int[] where all numbers have been incremented
//        Input => Output Examples:
//        { 1, 2, 3 } => { 2, 3, 4 }
//        { 45, 23 } => { 46, 24 }
//        { } => { }


public class ArrayUtils {

    public static int[] incriment(int[] arr) {

        for(int i = 0; i < arr.length; i++)
            arr[i] += 1;

        return arr;
    }
}
