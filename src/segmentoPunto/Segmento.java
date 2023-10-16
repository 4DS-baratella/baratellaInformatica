package segmentoPunto;

public class Segmento {
    private Punto p1;
    private Punto p2;



    public Segmento(Punto p1, Punto p2){
    // Aggregazione stretta
        this.p1 = new Punto (p1.getX(), p1.getY());
        this.p2 = new Punto (p2.getX(), p2.getY());

    //Aggregazione lasca
    //this.p1 = p1;
    //this.p2 = p2;
    }

    public void setP1(Punto p1){
        p1 = new Punto (p1.getX(), p1.getY());
    }

    public void setP2(Punto p2){
        p2 = new Punto (p2.getX(), p2.getY());
    }

    public Punto getP1() {
        Punto ptmp = new Punto(p1.getX(), p1.getY());
        return ptmp;
    }

    public Punto getP2() {
        Punto ptmp2 = new Punto(p2.getX(), p2.getY());
        return ptmp2;
    }

    public void trsX(float x){
        p1.setX(p1.getX() + x);
        p2.setX(p2.getX() + x);
    }

    public void trsY(float y){
        p1.setY(p1.getY() + y);
        p2.setY(p2.getY() + y);
    }

    public double lunghezza(){
        return Math.sqrt((Math.pow((p2.getX() - p1.getX()), 2)) + (Math.pow((p2.getY() - p1.getY()), 2)));
    }


    public String toString() {
        return "Punto 1 [x:" +p1.getX()+ "; y:" +p1.getY()+ "] Punto 2 [x:" +p2.getX()+ " ; y:" +p2.getY()+ "]";
    }
}

