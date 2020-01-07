package main.java.demo;

public class Employee extends Person {
    private String SSN;

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
}

class InheritanceExample{
    public static void main(String[] args) {
       Person person1 = new Person() ;
       person1.setName("Nishu");
       person1.setAge(13);

       System.out.println(String.format("%s's age is: %s", person1.getName(), person1.getAge()));

       //creating employee object
        Employee emp1 = new Employee();
        emp1.setName("Nik");
        emp1.setAge(17);
        emp1.setSSN("123-12-1234");

        System.out.println(String.format("%s's age is: %s and %s", emp1.getName(), emp1.getAge(), emp1.getSSN() ));



    }

}