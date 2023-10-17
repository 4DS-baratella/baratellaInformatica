package PuntoEreditario;

public class Test {
    public static void main(String[] args) {

        Punto punto = new Punto(5, 5);
        Punto3D punto3D = new Punto3D(5, 5, 5.2);
        PuntoColorato puntoColorato = new PuntoColorato(5 ,5, "giallo");

        System.out.println("Test 1 (valori base):");
        System.out.println("\nLe coordinate del punto sono: " + punto.toString());
        System.out.println("\nLe coordinate del punto 3D sono: " + punto3D.toString());
        System.out.println("\nLe coordinate del punto colorato sono: " + puntoColorato.toString());

        punto.shift(-20, 4);
        punto3D.shift(3, 5, -8.4);
        puntoColorato.shift(6, 4);


        System.out.println("\n\n\nTest 2 (valori shiftati):");
        System.out.println("\nLe coordinate del punto sono: " + punto.toString());
        System.out.println("\nLe coordinate del punto 3D sono: " + punto3D.toString());
        System.out.println("\nLe coordinate del punto colorato sono: " + puntoColorato.toString());

        puntoColorato.setColore("verde");

        System.out.println("\n\n\nTest 3 (cambio solo il colore del punto colorato):");
        System.out.println("\nLe coordinate del punto sono: " + punto.toString());
        System.out.println("\nLe coordinate del punto 3D sono: " + punto3D.toString());
        System.out.println("\nLe coordinate del punto colorato sono: " + puntoColorato.toString());

        System.out.println("\n\n\nTest 4 (verifico l'ereditarietà delle classi chiamando un metodo della classe madre nelle figlie):");
        System.out.println("\nLe coordinate del punto sono: " + punto.toString() + "   " + punto.sium());
        System.out.println("\nLe coordinate del punto 3D sono: " + punto3D.toString() + "   " + punto3D.sium());
        System.out.println("\nLe coordinate del punto colorato sono: " + puntoColorato.toString() + "   " + puntoColorato.sium());
    }
}
