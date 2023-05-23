package com.example.elliotts_bakery_project;

public class Cookie extends Item
{

    public Cookie(double price, String name)
    {
        super(price, name);
        this.setCategory("Cookies");
    }

}
