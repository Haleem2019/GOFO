package com.company;

import java.util.ArrayList;

public class PlaygroundOwner extends User {
    /**
     * A list of playgrounds that the owner owns
     */
    public ArrayList<Playground> playgrounds;

    /**
     * A constructor for the {@code PlaygroundOwner} object
     *
     * @param fn   first name of the owner
     * @param ln   last name of the owner
     * @param em   email of the owner
     * @param pass password of the owner
     * @param un   username of the owner
     * @param mn   mobile number of the owner
     */
    public PlaygroundOwner(String fn, String ln, String em, String pass, String un, String mn) {
        super(fn, ln, em, pass, un, mn);
        playgrounds = new ArrayList<>();
    }

    /**
     * Adds a new playground to the owner's list
     *
     * @param temp the playground to be added
     */
    public void addPlayground(Playground temp) {
        playgrounds.add(temp);
    }
    public ArrayList<Playground> getPlaygrounds() {
        return playgrounds;
    }

    /**
     * Gets the data of all the owner's playgrounds as a String
     * @return a String containing the details of the playgrounds
     */
    public String getBookings() {
        String res = "";
        for (int i = 0; i < playgrounds.size(); i++) {
            res += playgrounds.get(i).toString();
        }
        return res;
    }

    public void showBookings()
    {
        if (playgrounds.size()==0)
        {
            System.out.println("There is no Bookings now");
            return;
        }
        for (int i = 0 ; i<playgrounds.size();i++)
            System.out.println(playgrounds.get(i).toString());
    }
}