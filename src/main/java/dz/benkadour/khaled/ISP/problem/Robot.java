package dz.benkadour.khaled.ISP.problem;

public class Robot implements Worker {

    @Override
    public void work() {
        System.out.println("Robot is working...");
    }

    @Override
    public void eat() {
        // The robot doesn't need to eat
        throw new UnsupportedOperationException("Robots don't eat!");
    }
    
}
