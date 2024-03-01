// Abstract class GeometricFigure
abstract class GeometricFigure {
    protected double height;
    protected double width;
    protected String figureType;

    // Constructor
    public GeometricFigure(double height, double width, String figureType) {
        this.height = height;
        this.width = width;
        this.figureType = figureType;
    }

    // Abstract method to determine area
    public abstract double calculateArea();
}

// Subclass Square
class Square extends GeometricFigure {
    private double area;

    // Constructor
    public Square(double sideLength) {
        super(sideLength, sideLength, "Square");
    }

    // Method to calculate area
    @Override
    public double calculateArea() {
        area = height * width;
        return area;
    }

    // Method to get area
    public double getArea() {
        return area;
    }
}

// Subclass Triangle
class Triangle extends GeometricFigure {
    private double area;

    // Constructor
    public Triangle(double base, double height) {
        super(height, base, "Triangle");
    }

    // Method to calculate area
    @Override
    public double calculateArea() {
        area = 0.5 * height * width;
        return area;
    }

    // Method to get area
    public double getArea() {
        return area;
    }
}
