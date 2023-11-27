import java.util.Random;

interface Resizeable {
    void resize(double percent);
}

class Circle implements Resizeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double percent) {
        radius *= (1 + percent / 100);
    }
}

class Rectangle implements Resizeable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public void resize(double percent) {
        width *= (1 + percent / 100);
        height *= (1 + percent / 100);
    }
}

class Square implements Resizeable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public void resize(double percent) {
        side *= (1 + percent / 100);
    }
}

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(3);

        for (Resizeable shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                double initialArea = circle.getArea();
                double randomPercent = random.nextDouble() * 100;
                circle.resize(randomPercent);
                double finalArea = circle.getArea();

                System.out.println("Initial Area: " + initialArea);
                System.out.println("Final Area after resizing by " + randomPercent + "%: " + finalArea);
                System.out.println();
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                double initialArea = rectangle.getArea();
                double randomPercent = random.nextDouble() * 100;
                rectangle.resize(randomPercent);
                double finalArea = rectangle.getArea();

                System.out.println("Initial Area: " + initialArea);
                System.out.println("Final Area after resizing by " + randomPercent + "%: " + finalArea);
                System.out.println();
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                double initialArea = square.getArea();
                double randomPercent = random.nextDouble() * 100;
                square.resize(randomPercent);
                double finalArea = square.getArea();

                System.out.println("Initial Area: " + initialArea);
                System.out.println("Final Area after resizing by " + randomPercent + "%: " + finalArea);
                System.out.println();
            }
        }
    }
}