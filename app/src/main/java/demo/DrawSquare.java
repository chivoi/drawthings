package demo;

import com.google.inject.Inject;

public class DrawSquare implements DrawShape {

    @Inject
    public DrawShape drawSquare;

    // public DrawSquare(DrawShape shape) {
    // this.drawSquare = shape;
    // }

    @Override
    public void draw() {
        System.out.println("Drew a square");
    }
}
