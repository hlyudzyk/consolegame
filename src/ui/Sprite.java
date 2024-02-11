package ui;

import java.util.List;

public abstract class Sprite {
    protected int centerX;
    protected int centerY;
    protected List<Point> displayPoints;
    protected char displayPixel;


    public abstract void initializeShape();
    public List<Point> getDisplayPoints() {
        return displayPoints;
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
        initializeShape();
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
        initializeShape();
    }

}
