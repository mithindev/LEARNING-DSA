package com.Mithin.TRASH;

public class Student extends User{
    private String school;

    public Student(int userID, String name, String school) {
        super(userID, name);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
