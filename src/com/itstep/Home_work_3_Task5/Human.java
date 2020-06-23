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
public class Human {
    String firstName;
    String secondName;
    int age;
    Job job;
    Address homeAddress;


    public Human(String firstName, String secondName, int age, Job job,
                 Address homeAddress) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.job = job;
        this.homeAddress = homeAddress;
    }

    public void homeinformation() {
        System.out.println("My home address is " + homeAddress.addressinfo());
    }

    public void information() {
        System.out.println("My name is " + firstName + " " + secondName +
                ". I am " + age + " old.");
        homeinformation();
        job.jobInformation();

    }
}



