package main.java.demo;

public class Method {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;



        add(num1, num2);
        add(5,25);
        Today_Date();
        System.out.println("Today is " +Today_Date());
    }

    //method to add 2 numbers & print
    public static void add(int x, int y) {

        System.out.println("Adding two numbers " + (x + y));

    }

    public static int Today_Date () {
        return 4;
    }
}

