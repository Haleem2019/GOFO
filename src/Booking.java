package com.company;

import java.util.ArrayList;

public class Booking {
    protected ArrayList<Player> team;
    private Playground playground;
    private TimeSlot info;
    private Player player;


    Booking(){
        team = new ArrayList<Player>();
        player = new Player();
        info = new TimeSlot();
        playground =new Playground();
    }

    /**
     *
     * @param playground
     * @param slot
     * @param player
     */
    Booking(Playground playground,TimeSlot slot,Player player){
        this.playground=playground;
        this.player=player;
        info = slot;
    }
    /**
     *
     * @return
     */
    public ArrayList<Player> getTeam() {
        return team;
    }

    /**
     *
     * @param team
     */
    public void setTeam(ArrayList<Player> team) {
        this.team = team;
    }

    public void modifyTeam(){
        /******************* Do not know *********************/
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
}
