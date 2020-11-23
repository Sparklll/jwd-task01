package by.training.jwd.task01.problem7;

public class Problem7 {

    /* Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм,
    определяющий, которая из точек находится ближе к началу координат. */

    public static final double THRESHOLD = 1E-6;

    // return 1 - first point closer, 0 - equal distance, -1 - second point closer
    public int pointCloserToOrigin(Point a, Point b) {
        Point origin = new Point(0, 0);
        double aDistance = getDistanceBetweenPoints(a, origin);
        double bDistance = getDistanceBetweenPoints(b, origin);

        if(Math.abs(aDistance-bDistance) < THRESHOLD) {
            return 0;
        } else if(aDistance < bDistance) {
            return 1;
        }

        return -1;
    }

    private double getDistanceBetweenPoints(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}
