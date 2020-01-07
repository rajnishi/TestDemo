package main.java.demo;

public class Switch {

    public static void main(String[] args) {
        String grade = "B+";
        switch(grade){
            case "A+":
                System.out.println("Great student");
                break;

            case "A":
                System.out.println("Great student");
                break;

            case "A-":
                System.out.println("Great student");
                break;

            case "B+":  case "B-":  case "B":
                System.out.println("Good student");
                break;

            case "c":
                System.out.println("poor student");
                break;




        }
    }
}
