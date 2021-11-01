package com.nology;

public class Teachers extends Person{
    public Teachers(String name){
        super(name);
    }

    public void callMeeting(Person person) {
        System.out.println(name + " is calling a meeting with " + person.name + ".");
    }
}
