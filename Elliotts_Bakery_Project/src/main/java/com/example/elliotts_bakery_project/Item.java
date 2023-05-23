package com.example.elliotts_bakery_project;

public class Item
{
    private double price;
    private String name;
    private String category;

    public Item(double price, String name)
    {
        this.price = price;
        this.name = name;
        this.category = "Uncategorized";
    }

    public Item()
    {
    }

    public void setCategory(String category)
    {
        this.category = category;
    }


    public double getPrice(){return price;}
    public String getName(){return name;}

    public String toString()
    {
        return ("Category: " + category +"\n" +
                "Name: " + name + "\n" +
                "Price: $" + price);
    }
}
