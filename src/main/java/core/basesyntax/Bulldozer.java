package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Engine started!");
    }
    @Override
    public void stopWork() {
        System.out.println("Engine stoped!");
    }
}
