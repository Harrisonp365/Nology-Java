package com.nology;

import java.util.Arrays;

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



        int[] numArr = new int[50];
        ArrayUtils.fillMyArr(numArr);
        int[] newArr = ArrayUtils.incriment(numArr);
        //Assign to var then use Arrays.toString to get values not reference location
        System.out.println(Arrays.toString(newArr));
        //This gives you memory location rather than actually values from the array
        System.out.println(newArr);
    }
}
