package main.java.demo;

public class StaticMethod {
    public static void main(String[] args) {
        nameofDog("Leo");
        sleep();
    }

    public static void nameofDog(String name){

        System.out.println("My name is: %s" + name);
    }

    public static void sleep(){
        System.out.println("I am sleeping");
    }
}
