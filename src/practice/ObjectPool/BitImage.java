package practice.ObjectPool;

import java.awt.geom.Point2D;


public class BitImage implements Image{
    String name;
    private Point2D location;

    public BitImage(final String name) {
        this.name = name;
    }

    @Override public void draw() {
        System.out.println("Drawing :::");

    }

    @Override public Point2D getLocation() {
        return location;
    }

    @Override public void setLocation(final Point2D location) {
        this.location=location;
    }

    @Override public void reset() {
        location=null;
        System.out.println("Bitmap is reset ::");
    }
}
