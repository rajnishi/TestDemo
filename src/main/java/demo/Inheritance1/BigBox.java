package main.java.demo.Inheritance1;


    public class BigBox extends Box {
        private int height;
        private int length;
        private int width;

        public BigBox( int h, int l, int w) {
            super(h, l);
            this.height = h;
            this.length = l;
            this.width = w;
        }
        //Display box name
        public void displayBoxName() {
            System.out.println("This is the Big Box");
        }

        public void printarea() {
            double area = height *length *width;

            System.out.println("area of Big box " + area);
        }
    }

