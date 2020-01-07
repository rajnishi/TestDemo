package main.java.demo.Inheritance1;

public class SmallBox extends Box {
    private int height;
    private int length;

    public SmallBox( int h, int l) {
        super(h, l);
        this.height = h;
        this.length = l;
    }
        //Display box name
        public void displayBoxName() {
            System.out.println("This is the small Box");
        }

        public void printarea() {
            double area = height *length;

            System.out.println("area of small box " + area);
        }
    }
