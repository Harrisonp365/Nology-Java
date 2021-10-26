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
        int[] numArr = {1, 2, 3, 4, 5, 6};
        int[] newArr = ArrayUtils.incriment(numArr);
        System.out.println(Arrays.toString(newArr));
    }
}
