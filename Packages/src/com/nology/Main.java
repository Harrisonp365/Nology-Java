package com.nology;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	//What are lists? what is an ArrayList?
        //What are the pitfalls of using arrays?
        // How are lists different from arrays?
        //What are the benefits of using lists?

        //Lists are an interface
        //What is an interface?
        //An interface is a prescribed set of features that a class implements
        //Allows us to share functionality between classes

        //An arraylist is an array, that also implements list
//        Pen invisiblePen = new Pen("invisible");
//
//        ArrayList<Pen> pens = new ArrayList<Pen>();
//        Pen.onlyAddOnce(invisiblePen, pens);
//        pens.add(new Pen("blue"));
//        pens.add(new Pen("red"));
//        pens.add(new Pen("black"));
//        pens.add(0, new Pen("purple"));
//        System.out.println(pens.get(0).toString());
//
//        OutputAllPens(pens);

        ArrayList<String> someStudents = new ArrayList<>();
        String[] students = {
                "student0",
                "student1",
                "student2",
                "student3",
                "student4",
                "student5",
                "student6",
                "student7",
                "student8",
                "student9",
                "student10",
                "student11",
                "student12",
                "student13",
                "student14",
                "student15",
                "student16",
                "student11",
        };

        Random generator = new Random();
        String[] tmp = new String[10];
        for(int i = 0; i < 10; i++) {
            int randomIndex = generator.nextInt(students.length);
            tmp[i] = students[randomIndex];

                if(!someStudents.contains(tmp[i])){
                    someStudents.add(tmp[i]);
                }
        }
        System.out.println(Arrays.toString(tmp));
        System.out.println(someStudents);
    }
}
