package com.company;

import java.util.ArrayList;

public class Player{
    private ArrayList<Booking> myBookings;
    private eWallet myeWallet;
    private ArrayList<String> myReplay;
    private String fname,lname,phone,city;
    private int id;
    private ArrayList teamsEnrolled;
    private int currentOwner;
    public ArrayList<Playground> playgrounds;

    /**
     *
     * @param email
     */
    public void sendRequest(String email) {
        System.out.println("Invitation sent to: "+email);
    }

    /**
     *
     * @return
     */
    public ArrayList<Booking> getMyBookings() {
        return myBookings;
    }
    public Player(){
        myBookings = new ArrayList<Booking>();
        myeWallet = new eWallet();
    }
    /**
     *
     * @param fname
     * @param lname
     * @param phone
     * @param city
     * @param id
     */
    public Player(String fname,String lname,String phone,String city,int id,String TeamNames){
        this.fname=fname;
        this.lname=lname;
        this.id = id;
        this.phone = phone;
        this.city=city;
    }
    /**
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @param fname
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @param lname
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @param myBookings
     */
    public void setMyBookings(ArrayList<Booking> myBookings) {
        this.myBookings = myBookings;
    }

    /**
     *
     * @param myeWallet
     */

    public void setMyeWallet(eWallet myeWallet) {
        this.myeWallet = myeWallet;
    }

    /**
     *
     * @param myReplay
     */
    public void setMyReplay(ArrayList<String> myReplay) {
        this.myReplay = myReplay;
    }

    /**
     *
     * @return
     */
    public eWallet getMyeWallet() {
        return myeWallet;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @return
     */
    public String getFname() {
        return fname;
    }

    /**
     *
     * @return
     */
    public String getLname() {
        return lname;
    }

    /**
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getMyReplay() {
        return myReplay;
    }

    /**
     * Books a playground for the player at a specific time slot
     * @param playground the playground to be booked
     * @param timeSlot the time slot to book the playground at
     * @return whether successful of not
     */
    /*public boolean bookPlayground(Playground playground, TimeSlot timeSlot) {
        if (playground.isActivated() && playground.bookPlayground(timeSlot, this) ) {
            return true;
        }
        return false;
    }*/

    /**
     * Creates a new team owned by the player
     * @param name the name of the team
     * @param players a list of players to be in the team
     */
    /**
     * Reports a playground
     * @param playground the playground to be reported
     */
    public void reportPlayground(Playground playground) {
        if (playground.isActivated()) {
            playground.reportPlayground();
        }
    }
}

