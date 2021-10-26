package com.nology;

public class IcelandCohort {
    public String[] students = {
            "Harrison",
            "Cheyne",
            "Tim",
            "Stephen",
            "Jeremy",
            "Martyna",
            "Emily",
            "Andrew",
            "Natalie",
            "Blake",
            "Yujin",
            "Sandra",
            "Jinn",
            "Sebastian",
            "Prakash"
    };

    public String[] coaches = new String[3];

    public IcelandCohort() {
        coaches[0] = "Calum";
        coaches[1] = "Remi";
        coaches[2] = "Aidan";
    }

    public void AddNewCoach(String coachName) {
        String[] temp = new String[coaches.length + 1];

        for(int i = 0; i < coaches.length; i++)
            temp[i] = coaches[i];

        temp[temp.length - 1] = coachName;
        coaches = temp;
    }
}
