package com.company;


public class juniorPlayer extends Player {
    public boolean juniorQuestion;

    public juniorPlayer(String firstName, String surname, String position, Integer age, String club) {
        super(firstName, surname, position, age, club);
        juniorQuestion = true;
    }


    public void setJunior(boolean junior) {
        juniorQuestion = junior;
    }


//    // Age must be below 18 to be a junior # TODO
//    @Override
//    public void setAge(int newAge) {
//        super.setAge(newAge);
//    }
}
