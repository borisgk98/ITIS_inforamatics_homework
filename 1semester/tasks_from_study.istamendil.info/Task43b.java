import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

class Point {
    protected double x, y;
    Point(double PointX, double PointY) {
        x = PointX;
        y = PointY;
    }
    Point() {}
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}

class PointDistanceCalculator {
    static double distance(Point a, Point b) {
        return Math.sqrt(sqr(a.getX() - b.getX()) + sqr(a.getY() - b.getY()));
    }

    static double sqr(double a) {
        return a * a;
    }
}

class Task43b {
    public static void main(String[] args) throws java.io.FileNotFoundException {

        //from console
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble(), y1 = scan.nextDouble(),
                x2 = scan.nextDouble(), y2 = scan.nextDouble();
        Point p1 = new Point(x1, y1), p2 = new Point(x2, y2);
        System.out.printf("Distance (p1-p2): %.6f\n", PointDistanceCalculator.distance(p1, p2));

        //from file
        String programmPath = System.getProperty("user.dir") + System.getProperty("file.separator");
        File file = new File("input.txt");
        scan = new Scanner(file);
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        PrintWriter pw = new PrintWriter("output.txt");
        pw.printf("Distance (p1-p2): %.6f\n", PointDistanceCalculator.distance(p1, p2));
        pw.close();
        
    }
}
