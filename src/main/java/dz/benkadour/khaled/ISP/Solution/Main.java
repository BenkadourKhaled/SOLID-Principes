package dz.benkadour.khaled.ISP.Solution;
public class Main {
    public static void main(String[] args) {
        Workable developer = new Developer();
        Workable robot = new Robot();

        developer.work(); // Output: Developer is coding...
        robot.work();     // Output: Robot is working...

        Eatable eatableDeveloper = new Developer();
        eatableDeveloper.eat(); // Output: Developer is eating...
    }
}