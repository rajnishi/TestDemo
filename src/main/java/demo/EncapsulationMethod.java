package main.java.demo;

public class EncapsulationMethod {
    public static void main(String[] args) {
        Encapsulation name_obj = new Encapsulation();
         name_obj.setName("Raj");
         name_obj.setAge(25);

         System.out.println(String.format("name is %s and %d ", name_obj.getName(), name_obj.getAge()));
     //   System.out.println("Age is : "+name_obj.getAge());
    }


}
