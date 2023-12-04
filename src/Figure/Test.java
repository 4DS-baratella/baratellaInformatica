package Figure;

public class Test {
    public static void main(String[] args) {
        Quadrato quadrato = new Quadrato("Rosso", 5.0);
        TriangoloEquilatero triangolo = new TriangoloEquilatero("Blu", 4.0);
        Cerchio cerchio = new Cerchio("Verde", 3.0);
        Cubo cubo = new Cubo("Giallo", 6.0);
        Sfera sfera = new Sfera("Arancione", 2.0);

        // Test metodi Quadrato
        System.out.println("Quadrato:");
        System.out.println("Perimetro: " + quadrato.calcolaPerimetro());
        System.out.println("Area: " + quadrato.calcolaArea());
        System.out.println("Apotema: " + ((PoligonoRegolare) quadrato).calcolaApotema());
        System.out.println("Diagonale: " + quadrato.calcolaDiagonale());

        // Test metodi Triangolo
        System.out.println("\nTriangolo:");
        System.out.println("Perimetro: " + triangolo.calcolaPerimetro());
        System.out.println("Area: " + triangolo.calcolaArea());
        System.out.println("Apotema: " + ((PoligonoRegolare) triangolo).calcolaApotema());
        System.out.println("Altezza: " + triangolo.calcolaAltezza());

        // Test metodi Cerchio
        System.out.println("\nCerchio:");
        System.out.println("Perimetro: " + cerchio.calcolaPerimetro());
        System.out.println("Area: " + cerchio.calcolaArea());

        // Test metodi Cubo
        System.out.println("\nCubo:");
        System.out.println("Volume: " + cubo.calcolaVolume());

        // Test metodi Sfera
        System.out.println("\nSfera:");
        System.out.println("Volume: " + sfera.calcolaVolume());
    }
}
