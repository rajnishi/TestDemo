package main.java.demo.Inheritance1;

public class InheritanceExample2 {
    public static void main(String[] args) {
        //CallBox
        Box box1 = new Box(12,14);
        box1.displayBoxName();

        //CallBox small
        SmallBox box2 = new SmallBox(12,20);
        box2.displayBoxName();
        box2.printarea();

        //CallBox
        BigBox box3 = new BigBox(12,14, 5);
        box3.displayBoxName();
        box3.printarea();
    }
}
