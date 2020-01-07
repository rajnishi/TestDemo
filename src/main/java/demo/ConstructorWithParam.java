package main.java.demo;

class Vehicle {
    String VName;
    String VModel;
    int year;

    public Vehicle() {
        System.out.println("Default constructor");
    }

    public Vehicle(String name, String model, int year ){
        this.VName = name;
        this.VModel = model;
        this.year = year;

        System.out.println("constructor with parameters");
        System.out.println("Vehicle name "+ this.VName);
        System.out.println("Vehicle name "+ this.VModel);
        System.out.println("Vehicle name "+ this.year);

    }
    public void printVehicle() {
        System.out.println("Printing method printVehicle");
    }


}

 public class ConstructorWithParam {
    public static void main(String[] args) {
        System.out.println("Hi from Main ---");

        Vehicle Vehicle_obj = new Vehicle();//default construtor called

        Vehicle_obj.printVehicle();

        Vehicle Vehicle_obj1 = new Vehicle("Honda","Acura",1990);


    }

}
