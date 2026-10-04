public class Circle extends Shape {
    private double radius;

    public Circle(String color, String shapeType, String size, double radius) {
        super(color, shapeType, size);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayShape() {
        super.displayShape();
        System.out.println("Radius: " + radius);
    }
    
}
