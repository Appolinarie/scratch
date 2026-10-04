public class Shape {

   private String color;
     private String shapeType;
     private String size;

public Shape(String color, String shapeType, String size) {
    this.color = color;
    this.shapeType = shapeType;
    this.size = size;
}
public String getcolor() {
    return color;
}
public String getshapeType() {
    return shapeType;
}
public String getsize() {
    return size;
}
 
public  double calculateArea() {
    return 0;
    
}
public void displayShape() {
    System.out.println("Color: " + color);
    System.out.println("Shape Type: " + shapeType);
    System.out.println("Size: " + size);
    System.out.println("Area: " + calculateArea());
} 
    
}
