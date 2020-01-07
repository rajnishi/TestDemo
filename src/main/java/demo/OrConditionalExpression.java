package main.java.demo;

public class OrConditionalExpression {

    public static void main(String[] args) {
        double grade = 4.0;
        if(grade == 2.0){
            System.out.println("You are a awesome student");
        } else if(grade >=3.5 && grade < 4.0){
            System.out.println("You are a A grade student");
        } else if(grade >=3.0 && grade < 3.5){
            System.out.println(" You are a avergae student");
        } else if(grade >= 2.0 && grade < 3.0){
            System.out.println("You need to do better");
        } else {
            System.out.println("You failed the class");
        }
    }
}
