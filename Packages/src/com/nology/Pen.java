package com.nology;

import java.util.ArrayList;
import java.util.Iterator;

public class Pen {
    public String color;

    public Pen(String color){
        this.color = color;
    }

    public static void onlyAddOnce(Pen pen, ArrayList<Pen> pens) {
        if(pens.contains(pen)){
            return;
        }
        pens.add(pen);
    }

    public String toString() {
        return "I am a " + color + " pen.";
    }

    public static Pen FindPen(Pen pen, ArrayList<Pen> pens) {
        int index = pens.indexOf(pen);
        if(index < 0) {
            return null;
        } else {
            return pens.get(index);
        }
    }

    public static void OutputAllPens(ArrayList<Pen> pens) {
        Iterator<Pen> iterator = pens.iterator();

        while(iterator.hasNext()) {
            Pen currentPen = iterator.next();
            System.out.println(iterator.next());
        }
    }
}
