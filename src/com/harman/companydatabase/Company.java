package com.harman.companydatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Connection c= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/company?autoReconnect=true&useSSL=false","root","");

            String employeecode,employeename, designation, salary, phoneno;
            System.out.println("enter the employeecode: ");
            employeecode = input.next();
            System.out.println("Enter the employeename: ");
            employeename = input.next();
            System.out.println("enter the designation: ");
            designation = input.next();
            System.out.println("Enter the salary: ");
            salary = input.next();
            System.out.println("enter the phoneno: ");
            phoneno=input.next();
            Statement stmt=c.createStatement();
            stmt.executeUpdate("INSERT INTO `employee`( `employeecode`, `employeename`, `designation`, `salary`, `mobileno`)"+" VALUES("+employeecode+",'"+employeename+"','"+designation+"',"+salary+","+phoneno+")");
            System.out.println("inserted successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
