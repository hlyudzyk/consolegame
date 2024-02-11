package ui;


import java.util.ArrayList;
import java.util.List;

public class Ship extends Sprite {
    private int bulletSpawnX;

    public Ship(int centerX, int centerY,char displayPixel) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.displayPixel = displayPixel;
        displayPoints = new ArrayList<>();
        initializeShape();
    }

    @Override
    public void initializeShape() {
        displayPoints.clear();
        displayPoints.add(new Point(centerX,centerY, displayPixel));
        displayPoints.add(new Point(centerX-1,centerY, displayPixel));
        displayPoints.add(new Point(centerX+1,centerY, displayPixel));
        displayPoints.add(new Point(centerX,centerY-1, displayPixel));
    }

    public int getBulletSpawnX() {
        return bulletSpawnX;
    }

    public void setBulletSpawnX(int bulletSpawnX) {
        this.bulletSpawnX = bulletSpawnX;
    }
}
