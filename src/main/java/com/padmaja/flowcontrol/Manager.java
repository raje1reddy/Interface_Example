package com.padmaja.flowcontrol;

public class Manager extends Employee implements Interviewer,Trainable{
    int teamSize;
    void reportProjectStatus(){
        System.out.println("reportprojectstatus");
    }
        public void attendTraining(){
            System.out.println("Mgr. attendTraining");
    }
        public void conductInterview(){
            System.out.println("Mgr. conductInterview");
    }

}
