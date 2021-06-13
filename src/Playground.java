package com.company;

import java.sql.Time;
import java.util.ArrayList;

public class Playground<PlaygroundOwner> {
    /**
     * the owner of the playground
     */
    private PlaygroundOwner owner;
    /**
     * the name of the playground
     */
    private String playgroundName;
    /**
     * the description of the playground
     */
    private String description;
    /**
     * the available time slots of the playground
     */
    private ArrayList<TimeSlot> availability;
    /**
     * the booking number (ID) of the playground
     */
    private int bookingNumber;
    /**
     * the price per hour of the playground
     */
    private double pricePerHour;
    /**
     * the website link of the playground
     */
    private String link;
    /**
     * the number of reports made to the playground
     */
    private int reports;
    /**
     * stores whether the playground is activated or not
     */
    private boolean activated;
    private static int cnt = 0;

    /**
     * A default constructor for the {@code Playground} object
     *
     * @param owner the playground owner of the playground
     */
    public Playground(PlaygroundOwner owner) {
        this.owner = owner;
        playgroundName = "playground";
        description = "";
        pricePerHour = 0;
        bookingNumber = ++cnt;
        link = "";
        availability = new ArrayList<TimeSlot>();
        activated = false;
        reports = 0;
    }

    public Playground() {

    }

    /**
     * Sets the available time slots of the playground
     * @param ts an ArrayList of {@code TimeSlot}s
     */
    public void setAvailability(ArrayList<TimeSlot> ts) {
        availability.clear();
        availability.addAll(ts);
    }

    /**
     * Gets the time slots of the playground
     * @return the time slots of the playground
     */
    public ArrayList<TimeSlot> getAvailability() {
        return availability;
    }
    /**
     * Reports the playground, adding one to the number of reports
     */
    public void reportPlayground() {
        reports++;
    }

    /**
     * Gets the name of the playground
     * @return the name of the playground
     */
    public String getPlaygroundName() {
        return playgroundName;
    }

    /**
     * Sets the name of the playground
     * @param playgroundName the new name of the playground
     */
    public void setPlaygroundName(String playgroundName) {
        this.playgroundName = playgroundName;
    }

    /**
     * Gets the description of the playground
     * @return the description of the playground
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the playground
     * @param description the new description of the playground
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the booking number of the playground
     * @return the booking number of the playground
     */
    public int getBookingNumber() {
        return bookingNumber;
    }

    /**
     * Gets the price per hour of the playground
     * @return the price per hour of the playground
     */
    public double getPricePerHour() {
        return pricePerHour;
    }

    /**
     * Sets the price per hour of the playground
     * @param pricePerHour the new price per hour
     */
    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    /**
     * Gets the link of the website of the playground
     * @return link of the playground
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the link of the website of the playground
     * @param link the new link of the playground
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Checks whether the playground is activated or not
     * @return activated or not
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * Sets the activated attribute of the playground
     * @param activated the new activated value
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    /**
     * Gets the number of reports made to the playground
     * @return the number of reports made to the playground
     */
    public int getReports() {
        return reports;
    }
}
