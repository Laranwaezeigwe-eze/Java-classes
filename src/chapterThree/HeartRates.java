package chapterThree;

import java.util.Date;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    int age;
    int currentYear;
    double maximumHeartRate;

    public HeartRates() {

    }

    public HeartRates(String firstName, String lastName, int monthOfBirth, int dayOfBirth, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        if(monthOfBirth >= 1 && monthOfBirth <= 12)
        this.monthOfBirth = monthOfBirth;
    }

    public int getDayOfBirth() {

        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        if(dayOfBirth >= 1 && dayOfBirth <= 31)
         this.dayOfBirth = dayOfBirth;
    }

    public int getYearOfBirth() {

        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if(yearOfBirth >= 1900 && yearOfBirth <= 3000)
        this.yearOfBirth = yearOfBirth;
    }

    public String getDateOfBirth() {
        return dayOfBirth + "/" +  monthOfBirth + "/" +yearOfBirth;
}

    public int getAge() {
        age = 2021 - yearOfBirth;
        return age;
    }

    public double maximumHeartRate() {
            maximumHeartRate = 220 - age;
               return maximumHeartRate;
    }

    public String targetHeartRate() {
        double minimum_percent = 0.50 * maximumHeartRate();
        double maximum_percent = 0.85 * maximumHeartRate();
        return "Target Heart Rate: " + minimum_percent + " - " + maximum_percent;
    }


}

