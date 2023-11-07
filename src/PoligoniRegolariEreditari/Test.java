package PoligoniRegolariEreditari;

public class Test {
    public static void main(String[] args) {
        Rombo rombo = new Rombo(1000001, 1000001, '#');
        Quadrato quadrato = new Quadrato(5, '#');

        System.out.println("Rombo: ");
        System.out.println(rombo.toString());
        System.out.println(rombo.disegna());

        System.out.println("\nQuadrato: ");
        System.out.println(quadrato.toString());
        System.out.println(quadrato.disegna());
    }
}