package com.example.kongdech.finalend;

/**
 * Created by Kongdech on 10/8/2560.
 */

/**
 * Public class Customer
 */
public class Customer {
    private int id = -1;
    private String firstName = "";
    private String lastName = "";

    /**
     * Method return customer id
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Method set customer id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Method return customer firstName
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Method set Customer firstName
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Method return customer's lastName
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Method set customer's lastName
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

