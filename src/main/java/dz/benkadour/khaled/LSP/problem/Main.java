package dz.benkadour.khaled.LSP.problem;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Square();
        rectangle.setWidth(5);
        rectangle.setHeight(10);

        // LSP violated: We expect the area to be 5 * 10 = 50,
        // but the behavior of Square forces the height to equal the width.
        
        System.out.println("Expected area: 50, Actual area: " + rectangle.calculateArea());
        
        //Unexpected result: The calculated area is 100 instead of 50 because the logic of Square does not adhere to the expected behavior of Rectangle.
    }
}
