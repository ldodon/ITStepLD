package com.itstep.Home_work_7;

/**
 * Created by utilizator on 5/15/20.
 */
public class Address {
   protected String country;
   protected String city;
   protected String street;

    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }


    public String getFullAddress(){
        return street+", "+city+", "+country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
