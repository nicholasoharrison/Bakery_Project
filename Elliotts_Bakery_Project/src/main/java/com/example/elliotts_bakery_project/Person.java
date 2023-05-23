package com.example.elliotts_bakery_project;

public class Person
{
    private String name;
    private String phoneNum;

    Person(String name, String phoneNum)
    {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNum()
    {
        return phoneNum;
    }


}
