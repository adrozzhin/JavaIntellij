package com.syntax.reviewclass07;

public class MethodDemo {



    public static void main(String[] args) {
        String employeeFirstName = "Michaelghkjgjh";
        String employeeLastName = "Lopezjkhjkhjkhj";
        String position = "permanent";

        if(position.equalsIgnoreCase("permanent")) {
            String firstHalfOfFirstName = employeeFirstName.substring(0, employeeFirstName.length()/2);
            String firstHalfOfLastName = employeeLastName.substring(0, employeeLastName.length()/2);
            System.out.println(firstHalfOfFirstName + firstHalfOfLastName);
        } else {
            String firstHalfOfFirstName = employeeLastName.substring(0, employeeLastName.length()/2);
            String firstHalfOfLastName = employeeFirstName.substring(0, employeeFirstName.length()/2);
            System.out.println(firstHalfOfFirstName + firstHalfOfLastName);
        }
    }
}
