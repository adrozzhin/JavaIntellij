package com.syntax.Repl.Repl182;

public class Person {
    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    int birthyear;
    private String ssn;

    Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }
    public String getLirstname() {
        return lastname;
    }
    public int getBirthmonth() {
        return birthmonth;
    }
    public int getBirthday() {
        return birthday;
    }
    public int getBirthyear() {
        return birthyear;
    }
    public String getSsn() {
        return ssn;
    }

    public void formatBirthday() {
        System.out.println(birthmonth+ "/"+birthday+"/"+birthyear);
    }

}
