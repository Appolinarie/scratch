public class Main {
    public static void main(String[] args) {
        
        Shape shape = new Shape("Blue", "Circle", "Medium");

        System.out.println("color: " + shape.getcolor());
        System.out.println("Shape Type: " + shape.getshapeType());
        System.out.println("Size: " + shape.getsize());

        shape.displayShape();

        Rectangle rectangle = new Rectangle("Red", "Rectangle", "Large", 5.0, 3.0);
        System.out.println("\nRectangle Details:");
        rectangle.displayShape();

        Circle circle = new Circle("Green", "Circle", "Small", 2.5);
        System.out.println("\nCircle Details:");
        circle.displayShape();
    }
}