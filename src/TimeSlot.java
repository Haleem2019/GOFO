package com.company;

public class TimeSlot {
    /**
     * a day of the month
     */
    private int day;
    /**
     * a month of the year
     */
    private int month;
    /**
     * the year
     */
    private int year;
    /**
     * the starting hour of the time slot
     */
    private int startingHour;
    /**
     * the ending hour of the time slot
     */
    private int endingHour;
    /**
     * a boolean that specifies whether the time slot is booked or not
     */
    private boolean booked;
    /**
     * the username of the player that the time slot is booked to, if any
     */
    private String bookedTo;

    /**
     * A default constructor for the {@code TimeSlot} object
     */
    public TimeSlot() {
        this.day = 1;
        this.month = 1;
        this.year = 2020;
        this.startingHour = 0;
        this.endingHour = 0;
        booked = false;
    }

    /**
     * A constructor for the {@code TimeSlot} object
     *
     * @param day          day of the month
     * @param month        month of the year
     * @param year         year of the time slot
     * @param startingHour starting hour of the time slot
     * @param endingHour   ending hour of the time slot
     */
    public TimeSlot(int day, int month, int year, int startingHour, int endingHour) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.startingHour = startingHour;
        this.endingHour = endingHour;
        booked = false;
    }

    /**
     * Books the time slot to a specific player and stores his username
     *
     * @param username username of the player
     */
    public void book(String username) {
        booked = true;
        bookedTo = username;
    }

    /**
     * Unbooks the time slot
     */
    public void unbook() {
        booked = false;
        bookedTo = "";
    }

    /**
     * Checks whether the time slot is booked
     *
     * @return booked or not
     */
    public boolean isBooked() {
        return booked;
    }
}