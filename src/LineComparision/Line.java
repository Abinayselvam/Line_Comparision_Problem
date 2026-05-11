public class Line implements Comparable<Line>{
    int x1,x2,y1,y2;
    Line(int x1,int x2,int y1,int y2)
    {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    double length()
    {
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }

    @Override
    public int compareTo(Line other) {
        return Double.compare(this.length(), other.length());
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Line other)) return false;

        return Double.compare(this.length(), other.length()) == 0;
    }
}
