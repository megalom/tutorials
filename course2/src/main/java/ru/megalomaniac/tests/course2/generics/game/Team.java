package ru.megalomaniac.tests.course2.generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{
    private String name;
    private List<T> participants=new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant){
        participants.add(participant);
        System.out.println("There is a new participant in team "+name+". His name: "+((Participant) participant).getName());
    }

    public void playWith(Team<T> team){
        Random random = new Random();
        String winTeam;
        int winTeamId = random.nextInt(2);
        if(winTeamId==0)
            winTeam=this.name;
        else
            winTeam=team.getName();

        System.out.println("Team "+winTeam+" win!");

    }

}
