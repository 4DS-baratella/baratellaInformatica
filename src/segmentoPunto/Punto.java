package segmentoPunto;

public class Punto {
    float x, y;

    public Punto(float x, float y){
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

    public void trsX (float deltaX) {
        this.x = this.x + deltaX;
    }

    public void trsY (float deltaY) {
        this.y = this.y + deltaY;
    }

    public String toString() {
        return "(" + getX() + " ; " + getY() + ")";
    }
}
