package main.java.demo;

public class Method_20 {

    public static void main(String[] args) {

       // Findage(2020);
        System.out.println("The current age is  " + findage(2020)  );
    }

    public static int findage(int year){
        int age = 1973 - year;
        return age;

       // System.out.println("The age is "+  age);


    }
}
