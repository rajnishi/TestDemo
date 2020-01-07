package main.java.demo;

import java.sql.SQLOutput;

public class Switchtest {
    public static void main(String[] args) {
        String grade = "B-";
        switch(grade){
            case "A": case "A+": case "A-":
                System.out.println("Good Student");
            break;
            case "B": case "B+": case "B-":
                System.out.println("Avg Student");
            break;
            case "C": case "C+": case "C-":
                System.out.println("Poor Student");
                break;

        }

    }

}
