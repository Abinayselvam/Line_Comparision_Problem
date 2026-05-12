import java.awt.*;

public class Line implements Comparable<Line> {

    private final Point p1;
    private final Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double length() {
        int dx = (int) (p2.getX() - p1.getX());
        int dy = (int) (p2.getY() - p1.getY());
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Line other)) return false;

        return Double.compare(this.length(), other.length()) == 0;
    }

    @Override
    public int compareTo(Line other) {
        return Double.compare(this.length(), other.length());
    }
}