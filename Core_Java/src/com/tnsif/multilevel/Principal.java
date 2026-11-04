package com.tnsif.multilevel;

public class Principal extends Department {

    public void principalDetails() {
        System.out.println("Principal Name: Dr.Vinay Shivasubramanyan");
        System.out.println("Experience: 20 Years");
    }

    public static void main(String[] args) {

        Principal p = new Principal();

        p.collegeDetails();
        p.departmentDetails();
        p.principalDetails();
    }
}