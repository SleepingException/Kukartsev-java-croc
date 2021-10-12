package task1;

class Point {
    private double x;
    private double y;
    Point (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {return this.x;}
    public double getY() {return this.y;}
    public double len(Point end) {
        return Math.sqrt(Math.pow(end.x - this.x, 2) + Math.pow(end.y - this.y, 2));
    }
}
