package com.example.ex;

public class TrivPoint {

    private int x, y;

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void scale(int sx, int sy) {
        x *= sx;
        y *= sy;
    } // setters

    public void setX(int x) {
        if (x >= 0 && x <= 100) {
            this.x = x; // this required
        }
    }

    public void setY(int yy) {
        y = yy; // this.y assumed
    } // getters

    public int getX() {
        return x;
    }

    public int getY() {
        return this.y; // this assumed
    } // static

    public static void infoStatic(TrivPoint p) {
        System.out.println("[" + p.x + "," + p.y + "]");
    } // non-static

    public void info() {
        System.out.println("[" + this.x + "," + y + "]");
    }
}