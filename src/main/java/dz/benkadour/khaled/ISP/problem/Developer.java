package dz.benkadour.khaled.ISP.problem;

public class Developer implements Worker {
    @Override
    public void work() {
        System.out.println("Developer is coding...");
    }

    @Override
    public void eat() {
        System.out.println("Developer is eating...");
    }
}