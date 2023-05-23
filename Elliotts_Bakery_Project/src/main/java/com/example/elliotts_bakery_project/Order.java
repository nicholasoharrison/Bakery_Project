package com.example.elliotts_bakery_project;

import java.util.ArrayList;

public class Order
{
    private Person person;
    private ArrayList<Item> itemArray;

    public Order(Person person, ArrayList<Item> itemArray)
    {
        this.person = person;
        this.itemArray = itemArray;
    }

    public String getPerson()
    {
        return ("Name: " + person.getName() + "\nPhone Number: " + person.getPhoneNum());
    }
}
