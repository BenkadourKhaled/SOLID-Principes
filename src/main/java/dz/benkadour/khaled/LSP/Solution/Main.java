package dz.benkadour.khaled.LSP.Solution;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rectangle.calculateArea()); // 50

        Shape square = new Square(5);
        System.out.println("Square area: " + square.calculateArea()); // 25
    }
}
