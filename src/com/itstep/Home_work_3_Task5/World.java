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
public class World {

    public static void main(String[] args) {

        Address addressHome = new Address("Melestiu ", 26, "Chisinau",
                "Moldova");
        Address addressJob = new Address("Puskin ", 41, "Chisinau",
                "Moldova");
        Job job1 = new Job("Economist", addressJob);
        Human human1 = new Human("Laura", "Dodon", 26, job1,
                addressHome);
        job1.jobInformation();
        human1.homeinformation();
        human1.information();
    }
}
