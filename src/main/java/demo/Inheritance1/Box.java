package main.java.demo.Inheritance1;

public class Box {
    //variables
    private int height;
    private int length;

    public Box( int h, int l) {
        //Constructors
        this.height = h;
        this.length = l;
    }

    //Display box name
    public void displayBoxName() {
            System.out.println("This is the parent Box");
        }
    }
