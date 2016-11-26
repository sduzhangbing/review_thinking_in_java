package com.ban.start.polymorphism;

/**
 * 构造器内部多态
 * Created by banzhang on 16-11-26.
 */

class Glyph{
    public Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }

    void draw(){
        System.out.println("Glyph.draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;

    public RoundGlyph(int radius) {
        this.radius = radius;
        System.out.println("RoundGlyph.RoundGlyph(), radius=" + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius="+radius);
    }
}
public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }

}
