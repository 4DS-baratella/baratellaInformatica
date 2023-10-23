package PoligoniRegolariEreditari;

public class Test {
    public static void main(String[] args) {
        try{
            GestorePoligoni poligoni = new GestorePoligoni(5);

            Quadrato quadrato = new Quadrato(5);
            Rombo rombo = new Rombo(4, 6);
            Pentagono pentagono = new Pentagono(6);
            Esagono esagono = new Esagono(7);

            poligoni.addPoligono(quadrato);
            poligoni.addPoligono(rombo);
            poligoni.addPoligono(pentagono);
            poligoni.addPoligono(esagono);

            System.out.println(poligoni.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}