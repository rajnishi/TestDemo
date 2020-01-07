package main.java.demo.Methiod21int;

public class Dog {
    public static void main(String[] args) {
      barking();
      Eating();
      Sleeping();
      Play();
      NameOFAnimal("Max");

    }

    public static void NameOFAnimal(String name){

        System.out.println(String.format("My name is:  %s", name));

    }
    public  static void barking() {
        System.out.println("I am barking");
    }
    public  static void Eating() {
        System.out.println("I am Eating");

    }
    public  static void Sleeping() {
        System.out.println("I am Sleeping");

    }
    public  static void Play() {
        System.out.println("I am Play");

    }
}
