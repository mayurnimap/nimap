package com.example.recycleviewexample;

public class ContactModel {


    //here we will discuss that how many changes we are going to do beause we have made only
    // one layout so in that layout we have to change the value everytime thats why we are doing this

    int img;
    String name;
    String number;

    public ContactModel(int img ,String name,String number)
    {
        this.name=name;
        this.number=number;
        this.img=img;
    }

}
