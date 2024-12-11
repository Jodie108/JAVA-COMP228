package test;

public class PartTimeGameTester extends GameTester{

    private double workHours;

    public void setWorkHours(double hours) {
        this.workHours = hours;
    }
    @Override
    public double getSalary() {
        return 20 * workHours;
    }
}
