package ui;

public class Point {
    private int x;
    private int y;
    private char displayPixel;

    public Point(int x, int y, char displayPixel) {
        this.x = x;
        this.y = y;
        this.displayPixel = displayPixel;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getDisplayPixel() {
        return displayPixel;
    }

    public void setDisplayPixel(char displayPixel) {
        this.displayPixel = displayPixel;
    }
}
