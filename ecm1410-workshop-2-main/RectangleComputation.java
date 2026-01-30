public class RectangleComputation {
    public static void main(String[] args) {
        double height = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);
        double area = height  * width;
        double perimeter = 2 * height + 2 * width;
        double tolerance = 0.001;
        double ratio = height / width;
        boolean isSquare = (Math.abs(ratio - 1) < tolerance);
        if (isSquare) {
            System.out.println("Shape: Square");
        } else {
            System.out.println("Shape: Rectangle");
        }
        
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);


    }
}