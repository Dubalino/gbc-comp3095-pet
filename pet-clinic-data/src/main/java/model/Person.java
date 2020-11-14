package model;

public class Person {

    private String FirstName;
    private String LastName;

    public Person(){

    }

    public Person(String firstName, String lastName) {

        this.FirstName = firstName;
        this.LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
