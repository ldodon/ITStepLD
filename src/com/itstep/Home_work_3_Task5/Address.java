package com.itstep.Home_work_3_Task5;

/**
 Create a class of type Human, Address, Job.
 The Address class will have following properties: street, house number,
 city, country;
 Job class will have following properties: major, address;
 Human class will have following properties: First name, Second Name,
 age, job, home address;

 Human can go to job – display of the major and the job address
 where he/she is working;
 Human can also rest at home – display where the house address is;
 Human can tell about him – display information about him/her;

 */
public class Address {
    String street;
    int houseNumber;
    String city;
    String country;


public Address(String street, int houseNumber, String city,
               String country) {
    this.street = street;
    this.houseNumber = houseNumber;
    this.city = city;
    this.country = country;
}
public String addressinfo(){
    return street+houseNumber+", "+city+", "+country;
    }
}
