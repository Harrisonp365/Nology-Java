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
        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length; i++)
            temp[i] = arr[i] + 1;

        return temp;
    }

    public static int[] fillMyArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)Math.floor(Math.random() * 100);
        }
        return arr;
    }

    public static int[] reverseArr(int[] arr){
        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[arr.length - i - 1];
        }

        //This also works and the system out will work print the correct way
//        for(int i = arr.length - 1; i <= 0; i--){
//            //System.out.println(arr[i]);
//            temp[i] = arr[arr.length - i - 1];
//        }
// Calums way of reversing arr---------------------------------------------------------
//        int head = 0;
//        int tail = arr.length - 1;
//
//        while(head < tail) {
//            int tmp = arr[head];
//            arr[head++] = arr[tail];
//            arr[tail--] = tmp;
//        }
//        return arr;
//--------------------------------------------------------------------------------------
        return temp;

        //or use arrayList.reverse
    }
}
