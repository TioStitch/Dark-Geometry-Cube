package tiostitch.geometry.cube.controllers;

public class CharController {

    int x, y, width, height;

    public CharController(int x, int y, int width, int heigth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = heigth;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
