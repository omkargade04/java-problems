class Shape {
    public void display() {
        System.out.println("This is a shape");
    }
    interface Draw {
        void draw();
    }
}

class Circle extends Shape implements Shape.Draw {
    int radius;

    public Circle(int r) {
        this.radius = r;
    }

    @Override
    public void display() {
        System.out.println("This is a circle with radius: " + radius);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
} 

public class code14 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.displayShape();
        circle.draw();
    }
}