package com.nology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

//        IcelandCohort students = new IcelandCohort();
//        System.out.println(students.students.length);
//        System.out.println(Arrays.toString(students.students));
//        System.out.println(students.coaches.length);
//        System.out.println(Arrays.toString(students.coaches));
//
//        new IcelandCohort();
//
//        students.AddNewCoach("sam");
//        System.out.println(Arrays.toString(students.coaches));



//        int[] numArr = new int[]{1,2,3,4,5};
//        //ArrayUtils.fillMyArr(numArr);
//        int[] newArr = ArrayUtils.reverseArr(numArr);
//        //Assign to var then use Arrays.toString to get values not reference location
//        System.out.println(Arrays.toString(newArr));
//        //This gives you memory location rather than actually values from the array
//        System.out.println(newArr);

        Integer[] arr = {1,2,3,4};
        ArrayList<Integer> intList = new ArrayList(Arrays.asList(arr));
        Collections.reverse(intList);
        System.out.println(intList);
    }
}
