package com.padmaja.flowcontrol;
import java.lang.String;

interface Trainable{
 public void attendTraining();
}

interface Interviewer{
    public void conductInterview();
}

public class Employee {
    String name;
    String address;
    String phoneNumber;
    float experience;

    public void reachOffice(){
        System.out.println("reachedoffice- Gurgoan,India");
    }

    public void startProjectWork(){
        System.out.println("procure hardware");
        System.out.println("install software");

    }


}