package com.syntax.class25.OverridingDemo1;

public class Tester {
    public static void main(String[] args) {
        Employee employee = new Employee("Andrei");
        employee.performDailyActivities();
        Student student = new Student("Serge");
        student.performDailyActivities();
        Teacher teacher = new Teacher("Asghar");
        teacher.performDailyActivities();
    }
}
