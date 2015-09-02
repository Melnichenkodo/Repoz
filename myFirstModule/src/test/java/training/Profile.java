package training;

import org.testng.annotations.Test;

public class Profile {

    private int numberOfFriends=0;
    private char gender;
    private double avarageSalary=0.00;
    private String position;
    private char isPreviousJob;
    private char isAgreesToTravelAbroad;

    public Profile(int numberOfFriends, char gender, double avarageSalary, String position, char isPreviousJob, char isAgreesToTravelAbroad) {
        this.numberOfFriends = numberOfFriends;
        this.gender = gender;
        this.avarageSalary = avarageSalary;
        this.position = position;
        this.isPreviousJob = isPreviousJob;
        this.isAgreesToTravelAbroad = isAgreesToTravelAbroad;
    }

    public double getAvarageSalary(){
        return avarageSalary;
    }

    //@Test
    //public void main(){
        //System.out.println("Не коммитется");
    //}
}
