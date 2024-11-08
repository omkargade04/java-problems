class Shape{
    double length;
    double width;
    double height;

    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
        this.height = 0;
    }
    public Shape(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double calculate() {
        return length * width;
    }
}

class Test1 extends Shape {
    public Test1(double length, double width) {
        super(length, width);
    }
    public Test1(double length, double width, double height) {
        super(length, width, height);
    }
    @Override
    public double calculate() {
        if(height == 0) {
            super.calculate();
        } else {
            return length*width*height;
        }
    }
}

public class code9 {
    public static void main(String[] args) {
        Test1 rectangle = new Test1(5, 3);
        System.out.println("Area of the rectangle: " + rectangle.calculate());

        Test1 cuboid = new Test1(5, 3, 4);
        System.out.println("Volume of the cuboid: " + cuboid.calculate());
    }
}