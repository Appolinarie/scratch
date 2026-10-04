public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, String shapeType, String size, double length, double width) {
        super(color, shapeType, size);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void displayShape() {
        super.displayShape();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
    
}
