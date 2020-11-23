package by.training.jwd.task01.problem7;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public Point(double x, double y) {
        if(!(Double.isFinite(x) && Double.isFinite(y)))
            throw new IllegalArgumentException("Invalid point coordinates");

        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
