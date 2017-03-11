package com.hmkcode.android.vo;

/**
 * Created by sol12 on 10/03/2017.
 */
public class Person {


        private String name;
        private String country;
        private String twitter;

//getters & setters....


    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", country=" + country + ", twitter="
                + twitter + "]";
    }

   }
