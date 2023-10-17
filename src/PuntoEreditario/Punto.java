package PuntoEreditario;

public class Punto {
    private float x;
    private float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void shift(float deltaX , float deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public String sium(){
        return "SIUUUUUUMM";
    }
}
