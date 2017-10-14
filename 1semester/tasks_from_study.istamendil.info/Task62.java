import java.lang.*;
import java.util.*;

abstract class Tuple {
    abstract public Vector toVector();
}

abstract class Vector {
    abstract public double abs();
}

class Pair extends Tuple {
    double first, second;
    Pair(double a, double b) {
        first = a;
        second = b;
    }
    Pair(Pair pr) {
        first = pr.first;
        second = pr.second;
    }
    public Vector toVector() {
        return new Vector2D(new Pair(first, second));
    }
}

class Vector2D extends Vector{
    Pair pair;
    Vector2D(Pair pr) {
        pair = pr;
    }
    public double abs() {
        return Math.sqrt(pair.first * pair.first + pair.second * pair.second);
    }
    public double product(Vector2D vector2D) {
        return pair.first * vector2D.pair.second - pair.second * vector2D.pair.first;
    }
}

class Task62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vector2D v = new Vector2D(new Pair(3, 4));
        System.out.println(v.abs());
    }
}